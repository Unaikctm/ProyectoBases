package clases;

public class Irakaslea {
	private int id;
	private String izena;
	private String abizenak;
	private String erabiltzailea;
	private String pasahitza;
	private boolean admin;
	private boolean activo;
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
	public String getAbizenak() {
		return abizenak;
	}
	public void setAbizenak(String abizenak) {
		this.abizenak = abizenak;
	}
	public String getErabiltzailea() {
		return erabiltzailea;
	}
	public void setErabiltzailea(String erabiltzailea) {
		this.erabiltzailea = erabiltzailea;
	}
	public String getPasahitza() {
		return pasahitza;
	}
	public void setPasahitza(String pasahitza) {
		this.pasahitza = pasahitza;
	}
	public boolean isAdmin() {
		return admin;
	}
	public void setAdmin(boolean admin) {
		this.admin = admin;
	}
	public boolean isActivo() {
		return activo;
	}
	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	public Irakaslea(int id, String izena, String abizenak, String erabiltzailea, String pasahitza, boolean admin,
			boolean activo) {
		super();
		this.id = id;
		this.izena = izena;
		this.abizenak = abizenak;
		this.erabiltzailea = erabiltzailea;
		this.pasahitza = pasahitza;
		this.admin = admin;
		this.activo = activo;
	}
	@Override
	public String toString() {
		return "Irakalsea [id=" + id + ", izena=" + izena + ", abizenak=" + abizenak + ", erabiltzailea="
				+ erabiltzailea + ", pasahitza=" + pasahitza + ", admin=" + admin + ", activo=" + activo + "]";
	}
	
}
