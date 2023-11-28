package clases;

public class Proiektua {
	private int id;
	private String izena;
	private String ebaluazioa;
	private String ikasturtea;
	private String moduluak;
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
	public String getEbaluazioa() {
		return ebaluazioa;
	}
	public void setEbaluazioa(String ebaluazioa) {
		this.ebaluazioa = ebaluazioa;
	}
	public String getIkasturtea() {
		return ikasturtea;
	}
	public void setIkasturtea(String ikasturtea) {
		this.ikasturtea = ikasturtea;
	}
	public String getModuluak() {
		return moduluak;
	}
	public void setModuluak(String moduluak) {
		this.moduluak = moduluak;
	}
	public boolean isActivo() {
		return activo;
	}
	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	public Proiektua(int id, String izena, String ebaluazioa, String ikasturtea, String moduluak, boolean activo) {
		super();
		this.id = id;
		this.izena = izena;
		this.ebaluazioa = ebaluazioa;
		this.ikasturtea = ikasturtea;
		this.moduluak = moduluak;
		this.activo = activo;
	}
	
	public Proiektua() {
		
	}
	@Override
	public String toString() {
		return "Proiektuak [id=" + id + ", izena=" + izena + ", ebaluazioa=" + ebaluazioa + ", ikasturtea=" + ikasturtea
				+ ", moduluak=" + moduluak + ", activo=" + activo + "]";
	}
	

}
