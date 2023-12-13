package Modelos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import clases.Proiektua;
import conector.Conector;
public class ModeloProiektua extends Conector{
	public ArrayList<Proiektua> selectAll(){
		ArrayList<Proiektua> proiektuak = new ArrayList<Proiektua>();
		
		try {
			PreparedStatement st = getCon().prepareStatement("select * from proiektuak");
			ResultSet rs = st.executeQuery();
			
			while (rs.next()) {
				Proiektua proiektua = new Proiektua();
				proiektua.setId(rs.getInt("id"));
				proiektua.setIzena(rs.getString("izena"));
				proiektua.setEbaluazioa(rs.getString("abizena"));
				proiektua.setIkasturtea(rs.getString("taldea"));
				proiektua.setModuluak(rs.getString("moduluak"));
				proiektua.setAktibo(rs.getBoolean("aktibo_dago"));
				
				proiektuak.add(proiektua);
			}
			rs.close();
			st.close();
			return proiektuak;
		}catch (Exception e) {
			System.out.println("No se ha podido ejecutar la query");
		}
		
		return null;
		
	}
	public Proiektua select(int idProiektua) {
	    try {
	        PreparedStatement st = getCon().prepareStatement("SELECT * FROM proiektuak WHERE id = ?");
	        st.setInt(1, idProiektua);
	        ResultSet rs = st.executeQuery();

	        if (rs.next()) {
	        	Proiektua proiektua = new Proiektua();
	            proiektua.setId(rs.getInt("id"));
	            proiektua.setIzena(rs.getString("izena"));
	            proiektua.setEbaluazioa(rs.getString("ebaluazioa"));
				proiektua.setIkasturtea(rs.getString("ikasturtea"));
	            proiektua.setModuluak(rs.getString("moduluak"));
	            proiektua.setAktibo(rs.getBoolean("aktibo_dago"));

	            return proiektua;
	        }
	        rs.close();
	        st.close();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return null;
	}
	
	public void insert(Proiektua proiektua) {
	    try {
	        PreparedStatement st = getCon().prepareStatement("INSERT INTO proiektuak (izena, ebaluazioa, ikasturtea, moduluak, aktibo_dago) VALUES (?, ?, ?, ?, ?)");
	        st.setString(1, proiektua.getIzena());
	        st.setString(2, proiektua.getEbaluazioa());
	        st.setString(3, proiektua.getIkasturtea());
	        st.setString(4, proiektua.getModuluak());
	        st.setBoolean(5, proiektua.isAktibo());

	        st.executeUpdate();
	        st.close();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}
	
	public void update(Proiektua proiektua) {
	    try {
	        PreparedStatement st = getCon().prepareStatement("UPDATE proiektuak SET izena = ?, ebaluazioa = ?, ikasturtea = ?, moduluak = ?, aktibo_dago = ? WHERE id = ?");
	        st.setString(1, proiektua.getIzena());
	        st.setString(2, proiektua.getEbaluazioa());
	        st.setString(3, proiektua.getIkasturtea());
	        st.setString(4, proiektua.getModuluak());
	        st.setBoolean(5, proiektua.isAktibo());
	        st.setInt(6, proiektua.getId());

	        st.executeUpdate();
	        st.close();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}
	
	public void delete(int idProiektua) {
	    try {
	        PreparedStatement st = getCon().prepareStatement("DELETE FROM proiektuak WHERE id = ?");
	        st.setInt(1, idProiektua);

	        st.executeUpdate();
	        st.close();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}

}
