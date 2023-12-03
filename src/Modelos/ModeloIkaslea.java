package Modelos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
			return proiektuak;
		}catch (Exception e) {
			System.out.println("No se ha podido ejecutar la query");
		}
		
		return null;
		
	}
}
