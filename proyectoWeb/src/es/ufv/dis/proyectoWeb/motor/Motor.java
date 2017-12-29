package es.ufv.dis.proyectoWeb.motor;

import es.ufv.dis.proyectoWeb.bean.Persona;
import es.ufv.dis.proyectoWeb.dao.Dao;

public class Motor {

	public Persona getDatosCurriculum()
	{
		Dao dao = new Dao();
		Persona persona = dao.leeXML();
		return persona;
	}
	
	
	
	
	
}
