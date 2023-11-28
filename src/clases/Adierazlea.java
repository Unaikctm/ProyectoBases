package clases;

public class Adierazlea {
	private int id;
	private String izena;
	private String deskribapena;
	private int konpetentzia_id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getIzena() {
		return izena;
	}
	public void setIzena(String izena) {
		this.izena = izena;
	}
	public String getDeskribapena() {
		return deskribapena;
	}
	public void setDeskribapena(String deskribapena) {
		this.deskribapena = deskribapena;
	}
	public int getKonpetentzia_id() {
		return konpetentzia_id;
	}
	public void setKonpetentzia_id(int konpetentzia_id) {
		this.konpetentzia_id = konpetentzia_id;
	}
	public Adierazlea(int id, String izena, String deskribapena, int konpetentzia_id) {
		super();
		this.id = id;
		this.izena = izena;
		this.deskribapena = deskribapena;
		this.konpetentzia_id = konpetentzia_id;
	}
	@Override
	public String toString() {
		return "Adierazlea [id=" + id + ", izena=" + izena + ", deskribapena=" + deskribapena + ", konpetentzia_id="
				+ konpetentzia_id + "]";
	}
	
}
