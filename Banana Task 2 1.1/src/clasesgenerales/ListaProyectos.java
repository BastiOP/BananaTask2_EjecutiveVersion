package clasesgenerales;
import java.util.*;

import clasesbasicas.Proyecto;
public class ListaProyectos {
	private LinkedList<Proyecto> listaProyecto;
	
	public ListaProyectos() {
		 listaProyecto = new LinkedList<Proyecto>();
	}
	
	public void agregarProyecto(Proyecto proyecto) {
		listaProyecto.add(proyecto);
	}
	
	public boolean editarProyecto(Proyecto proyecto) {
		for (Proyecto auxiliar : listaProyecto) {
			if(auxiliar.equals(proyecto)) {
				auxiliar = proyecto;
				return true;
			}
		}
		return false;
	}
	
	public boolean eliminarProyecto(String nombreProyecto) {
		for (Proyecto proyecto : listaProyecto) {
			if (nombreProyecto.compareTo(proyecto.getNombre()) == 0) {
				listaProyecto.remove(proyecto);
				return true;
			}
		}
		return false;
	}
	
/*	public void mostrarProyecto()
	{
		public ListaFases listaFasesAux; 
		
		for(Proyecto proyecto : listaProyecto) //recorre la lista de proyectos
		{
			System.out.print("Proyecto " +proyecto.getNombre() + " perteneciente al cliente " +proyecto.getCliente()); //y muestra toda la informacion asociada, como el nombre del proyecto y el cliente al que pertenece 
			
			if(proyecto.isTerminado())
			{
				System.out.println(". Este proyecto ya est� terminado.");//imprime en caso de que est� terminado
			}
			else
			{
				System.out.println(". Este proyecto no est� terminado.");//imprime en caso de que no est� temrinado
			}
			
			 proyecto.getListaFases//recorre la lista de fases de cada proyecto
		}
	}*/

	public LinkedList<Proyecto> getListaProyecto() {
		return listaProyecto;
	}

	public void setListaProyecto(LinkedList<Proyecto> listaProyecto) {
		this.listaProyecto = listaProyecto;
	}
}
