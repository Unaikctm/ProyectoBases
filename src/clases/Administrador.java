package clases;

public class Administrador {
	
	private int id;
	private String nombre;
	private String apellido;
	private String username;
	private String password;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Administrador(int id, String nombre, String apellido, String username, String password) {
		
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.username = username;
		this.password = password;
	}
	@Override
	public String toString() {
		return "Administrador [Id=" + id + ", Nombre=" + nombre + ", Apellido=" + apellido + ", Username=" + username
				+ ", Password=" + password + "]";
	}
	

}
