package clases;

public class Irakaslea {
	private int id;
	private String izena;
	private String abizenak;
	private String erabiltzailea;
	private String pasahitza;
	private boolean admin_da;
	private boolean aktibo_dago;
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
		return admin_da;
	}
	public void setAdmin(boolean admin) {
		this.admin_da = admin;
	}
	public boolean isAktibo() {
		return aktibo_dago;
	}
	public void setAktibo(boolean activo) {
		this.aktibo_dago = activo;
	}
	public Irakaslea(int id, String izena, String abizenak, String erabiltzailea, String pasahitza, boolean admin,
			boolean activo) {
		super();
		this.id = id;
		this.izena = izena;
		this.abizenak = abizenak;
		this.erabiltzailea = erabiltzailea;
		this.pasahitza = pasahitza;
		this.admin_da = admin;
		this.aktibo_dago = activo;
	}
	@Override
	public String toString() {
		return "Irakalsea [id=" + id + ", izena=" + izena + ", abizenak=" + abizenak + ", erabiltzailea="
				+ erabiltzailea + ", pasahitza=" + pasahitza + ", admin=" + admin_da + ", activo=" + aktibo_dago + "]";
	}
	
}
