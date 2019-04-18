package objetosbasicos;

public class Empleado {
	private String identificador;
	private String contrase�a;
	private String nombre;
	private String ocupacion;
	private boolean admin;
	private boolean trabajando;
	
	
	public Empleado() {
	}
	
	
	public Empleado(String identificador, String contrase�a, String nombre, String ocupacion, boolean admin, boolean trabajando) {
		this.identificador = identificador;
		this.contrase�a = contrase�a;
		this.nombre = nombre;
		this.ocupacion = ocupacion;
		this.admin = admin;
		this.trabajando = trabajando;
	}

	
	public String getIdentificador() {
		return identificador;
	}
	
	
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	
	
	public String getContrase�a() {
		return contrase�a;
	}
	
	
	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	public String getOcupacion() {
		return ocupacion;
	}
	
	
	public void setOcupacion(String ocupacion) {
		this.ocupacion = ocupacion;
	}
	
	
	public boolean isAdmin() {
		return admin;
	}
	
	
	public void setAdmin(boolean admin) {
		this.admin = admin;
	}


	public boolean isTrabajando() {
		return trabajando;
	}


	public void setTrabajando(boolean trabajando) {
		this.trabajando = trabajando;
	}
	
	
}
