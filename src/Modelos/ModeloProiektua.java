package Modelos;

import java.sql.*;
import java.util.ArrayList;

import clases.Proiektua;
import conector.Conector;

public class ModeloProiektua extends Conector{
	
	public ArrayList<Proiektua> selectAll(){
		ArrayList<Proiektua> proiektuak = new ArrayList<Proiektua>();
		
		try {
			PreparedStatement st = getCon().prepareStatement("select * from clientes");
			ResultSet rs = st.executeQuery();
			
			while (rs.next()) {
				Proiektua proiektua = new Proiektua();
				proiektua.setId(rs.getInt(1));
				proiektua.setIzena(rs.getString(2));
				proiektua.setEbaluazioa(rs.getString(3));
				proiektua.setIkasturtea(rs.getString(4));
				proiektua.setModuluak(rs.getString(5));
				proiektua.setActivo(rs.getBoolean(6));
				
				proiektuak.add(proiektua);
			}
			return proiektuak;
		}catch (Exception e) {
			System.out.println("No se ha podido ejecutar la query");
		}
		
		return null;
		
	}
}
