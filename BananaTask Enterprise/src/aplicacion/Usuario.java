package aplicacion;
import java.util.*;

public class Usuario {
	private String nombreUsuario;
	private String contrase�aUsuario;
	private String nombres;
	private String apellidos;
	private String ocupacion;
	private boolean administrador; 
	private LinkedList <Proyecto> proyectosUsuario;
	
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	public String getContrase�aUsuario() {
		return contrase�aUsuario;
	}
	public void setContrase�aUsuario(String contrase�aUsuario) {
		this.contrase�aUsuario = contrase�aUsuario;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getOcupacion() {
		return ocupacion;
	}
	public void setOcupacion(String ocupacion) {
		this.ocupacion = ocupacion;
	}
	public LinkedList<Proyecto> getProyectosUsuario() {
		return proyectosUsuario;
	}
	public void setProyectosUsuario(LinkedList<Proyecto> proyectosUsuario) {
		this.proyectosUsuario = proyectosUsuario;
	}
	public boolean isAdministrador() {
		return administrador;
	}
	public void setAdministrador(boolean administrador) {
		this.administrador = administrador;
	}
	
	

}