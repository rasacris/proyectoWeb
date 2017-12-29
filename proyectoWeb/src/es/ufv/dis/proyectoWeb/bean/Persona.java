package es.ufv.dis.proyectoWeb.bean;


import java.util.Vector;

public class Persona {
	
	
	private String nombre;
	private String apellidos;
	private Vector<Empresa> empresas;

	public Persona() {
		super();
	}

	public Persona(String nombre, String apellidos, Vector<Empresa> empresas) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.empresas = empresas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Vector<Empresa> getEmpresas() {
		return empresas;
	}


	public void setEmpresas(Vector<Empresa> empresas) {
		this.empresas = empresas;
	}
	
	
	public int empresasSize()
	{
		return empresas.size();
	}
	
	public Empresa getEmpresa(int i)
	{
		if (i> empresas.size())
			return null;
		
		return empresas.elementAt(i);
	}
	
	
	

}
