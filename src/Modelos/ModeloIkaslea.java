package Modelos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import clases.Ikaslea;
import conector.Conector;

public class ModeloIkaslea extends Conector {
	
	public ArrayList<Ikaslea> selectAll(){
		ArrayList<Ikaslea> proiektuak = new ArrayList<Ikaslea>();
		
		try {
			PreparedStatement st = getCon().prepareStatement("select * from ikasleak");
			ResultSet rs = st.executeQuery();
			
			while (rs.next()) {
				Ikaslea ikaslea = new Ikaslea();
				ikaslea.setId(rs.getInt("id"));
				ikaslea.setIzena(rs.getString("izena"));
				ikaslea.setAbizena(rs.getString("abizena"));
				ikaslea.setTaldea(rs.getString("taldea"));
				ikaslea.setAktibo(rs.getBoolean("aktibo_dago"));
				
				proiektuak.add(ikaslea);
			}
			rs.close();
			st.close();
			return proiektuak;
		}catch (Exception e) {
			System.out.println("No se ha podido ejecutar la query");
		}
		
		return null;
		
	}
	
	public Ikaslea select(int idIkaslea) {
	    try {
	        PreparedStatement st = getCon().prepareStatement("SELECT * FROM ikasleak WHERE id = ?");
	        st.setInt(1, idIkaslea);
	        ResultSet rs = st.executeQuery();

	        if (rs.next()) {
	            Ikaslea ikaslea = new Ikaslea();
	            ikaslea.setId(rs.getInt("id"));
	            ikaslea.setIzena(rs.getString("izena"));
	            ikaslea.setAbizena(rs.getString("abizena"));
	            ikaslea.setTaldea(rs.getString("taldea"));
	            ikaslea.setAktibo(rs.getBoolean("aktibo_dago"));

	            return ikaslea;
	        }
	        rs.close();
	        st.close();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return null;
	}
	
	public void insert(Ikaslea ikaslea) {
	    try {
	        PreparedStatement st = getCon().prepareStatement("INSERT INTO ikasleak (izena, abizena, taldea, aktibo_dago) VALUES (?, ?, ?, ?)");
	        st.setString(1, ikaslea.getIzena());
	        st.setString(2, ikaslea.getAbizena());
	        st.setString(3, ikaslea.getTaldea());
	        st.setBoolean(4, ikaslea.isAktibo());

	        st.executeUpdate();
	        st.close();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}
	
	public void update(Ikaslea ikaslea) {
	    try {
	        PreparedStatement st = getCon().prepareStatement("UPDATE ikasleak SET izena = ?, abizena = ?, taldea = ?, aktibo_dago = ? WHERE id = ?");
	        st.setString(1, ikaslea.getIzena());
	        st.setString(2, ikaslea.getAbizena());
	        st.setString(3, ikaslea.getTaldea());
	        st.setBoolean(4, ikaslea.isAktibo());
	        st.setInt(5, ikaslea.getId());

	        st.executeUpdate();
	        st.close();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}
	
	public void delete(int idIkaslea) {
	    try {
	        PreparedStatement st = getCon().prepareStatement("DELETE FROM ikasleak WHERE id = ?");
	        st.setInt(1, idIkaslea);

	        st.executeUpdate();
	        st.close();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}




}
