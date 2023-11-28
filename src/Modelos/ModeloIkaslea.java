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
			PreparedStatement st = getCon().prepareStatement("select * from clientes");
			ResultSet rs = st.executeQuery();
			
			while (rs.next()) {
				Ikaslea ikaslea = new Ikaslea();
				ikaslea.setId(rs.getInt(1));
				ikaslea.setIzena(rs.getString(2));
				ikaslea.setAbizena(rs.getString(3));
				ikaslea.setTaldea(rs.getString(4));
				ikaslea.setActivo(rs.getBoolean(5));
				
				proiektuak.add(ikaslea);
			}
			return proiektuak;
		}catch (Exception e) {
			System.out.println("No se ha podido ejecutar la queryy");
		}
		
		return null;
		
	}
}
