package clases;

public class Konpetentzia {

	private int id;
	private String izena;
	private String deskribapena;
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
	public Konpetentzia(int id, String izena, String deskribapena) {
		super();
		this.id = id;
		this.izena = izena;
		this.deskribapena = deskribapena;
	}
	@Override
	public String toString() {
		return "Konpetentzia [id=" + id + ", izena=" + izena + ", deskribapena=" + deskribapena + "]";
	}
	
}
