package clases;

public class Ikaslea {
	private int id;
	private String izena;
	private String abizenak;
	private String taldea;
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
	public String getApellido() {
		return abizenak;
	}
	public void setApellido(String apellido) {
		this.abizenak = apellido;
	}
	public String getGrupo() {
		return taldea;
	}
	public void setGrupo(String grupo) {
		this.taldea = grupo;
	}
	public boolean isActivo() {
		return activo;
	}
	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	public Ikaslea(int id, String izena, String apellido, String grupo, boolean activo) {
		super();
		this.id = id;
		this.izena = izena;
		this.abizenak = apellido;
		this.taldea = grupo;
		this.activo = activo;
	}
	@Override
	public String toString() {
		return "Alumno [id=" + id + ", izena=" + izena + ", apellido=" + abizenak + ", grupo=" + taldea + ", activo="
				+ activo + "]";
	}
	
}
