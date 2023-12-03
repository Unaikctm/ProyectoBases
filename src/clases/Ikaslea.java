package clases;

public class Ikaslea {
	private int id;
	private String izena;
	private String abizena;
	private String taldea;
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
	public String getAbizena() {
		return abizena;
	}
	public void setAbizena(String apellido) {
		this.abizena = abizena;
	}
	public String getTaldea() {
		return taldea;
	}
	public void setTaldea(String grupo) {
		this.taldea = grupo;
	}
	public boolean isAktibo() {
		return aktibo_dago;
	}
	public void setAktibo(boolean activo) {
		this.aktibo_dago = activo;
	}
	public Ikaslea(int id, String izena, String abizena, String taldea, boolean activo) {
		super();
		this.id = id;
		this.izena = izena;
		this.abizena = abizena;
		this.taldea = taldea;
		this.aktibo_dago = activo;
	}
	public Ikaslea() {
		
	}
	@Override
	public String toString() {
		return "Alumno [id=" + id + ", izena=" + izena + ", apellido=" + abizena + ", grupo=" + taldea + ", activo="
				+ aktibo_dago + "]";
	}
	
}
