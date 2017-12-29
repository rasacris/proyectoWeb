package es.ufv.dis.proyectoWeb.dao;

import java.io.File;
import java.util.Vector;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import es.ufv.dis.proyectoWeb.bean.Empresa;
import es.ufv.dis.proyectoWeb.bean.Persona;


public class Dao {

	
	public Persona leeXML()
	{
		Persona persona = null;
		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();   
		DocumentBuilder docBuilder = null;
		try {
			docBuilder = docBuilderFactory.newDocumentBuilder();
			Document doc = docBuilder.parse (new File("F:/UFV/2015-2016/dis/ejercicios/ejercicio0/src/es/ufv/dis/xml/curriculum.xml"));
			//Document doc = docBuilder.parse(Class.class.getResourceAsStream("/es/ufv/dis/ejercicio1/xml/cv.xml"));
			doc.getDocumentElement().normalize();   
			
			Element raiz = doc.getDocumentElement();
			
			// lectura de datos personales: nombre y apellidos
			NodeList datosPersonalesList = raiz.getElementsByTagName("datos_personales");
			Node datosPersonalesNodo = datosPersonalesList.item(0);
			Element datosPersonalesElement = (Element)datosPersonalesNodo;
			NodeList nombreList = datosPersonalesElement.getElementsByTagName("nombre");
			Element nombreElement = (Element)nombreList.item(0);
			String nombre = nombreElement.getTextContent();

			String apellidos = ((Element)datosPersonalesElement.getElementsByTagName("apellidos").item(0)).getTextContent();
			
			System.out.println("Nombre: "+nombre + " "+apellidos);
			// leemos la experiencia
			
			Element experienciaElement =(Element)raiz.getElementsByTagName("experiencia_laboral").item(0);
			
			NodeList empresasList = experienciaElement.getElementsByTagName("empresa");
			
			Vector<Empresa> empresas = new Vector<Empresa>();
			
			for (int i = 0; i < empresasList.getLength(); i++)
			{
				Element empresaElement = (Element)empresasList.item(i);
				String nombreEmpresa = empresaElement.getTextContent();
				String duracion = empresaElement.getAttribute("duracion");
				System.out.println("Empresa: "+nombreEmpresa+". Tiempo en la empresa: "+duracion+" meses");
				Empresa emp = new Empresa(nombreEmpresa, duracion);
				empresas.addElement(emp);
				
			}

			persona = new Persona(nombre, apellidos, empresas);
			
		}
		catch (Exception e)
		{
			System.out.println("excepcion e"+e);
		}

		return persona;
		
	}
	
	
}
