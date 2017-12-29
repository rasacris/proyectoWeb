package es.ufv.dis.proyectoWeb.bean;


public class Empresa {

	
	private String nombre;
	private String duracion;
	
	
	public Empresa() {
		
	}


	public Empresa(String nombre, String duracion) {
		super();
		this.nombre = nombre;
		this.duracion = duracion;
	}
	
	
	public String getNombre()
	{
		return nombre;
	}
	
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}


	public String getDuracion() {
		return duracion;
	}


	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}
	
	
	
	
}
