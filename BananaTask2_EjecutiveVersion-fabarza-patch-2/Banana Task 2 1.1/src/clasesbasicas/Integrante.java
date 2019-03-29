package clasesbasicas;

import clasesgenerales.ListaProyectos;

public class Integrante {
	private String identificador;
	private String contrase�a;
	private String nombre;
	private String ocupacion;
	private boolean admin;
	private ListaProyectos listaProyectos;
	
	public Integrante() {
	}
	
	public Integrante(String identificador, String contrase�a, String nombre, String ocupacion, boolean admin) {
		this.identificador = identificador;
		this.contrase�a = contrase�a;
		this.nombre = nombre;
		this.ocupacion = ocupacion;
		this.admin = admin;
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

	public ListaProyectos getListaProyectos() {
		return listaProyectos;
	}

	public void setListaProyectos(ListaProyectos listaProyectos) {
		this.listaProyectos = listaProyectos;
	}
	
	
}
