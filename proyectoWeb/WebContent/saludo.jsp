<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ page import="es.ufv.dis.proyectoWeb.dao.Dao" %>
<%@ page import="es.ufv.dis.proyectoWeb.motor.Motor" %>
<%@ page import="es.ufv.dis.proyectoWeb.bean.Persona" %>
<%@ page import="es.ufv.dis.proyectoWeb.bean.Empresa" %>
<%@ page import="java.util.Vector" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Saludo</title>
</head>
<body>
Hola a todos
<%
String nombre = "raul";
Motor motor = new Motor();
Persona persona = motor.getDatosCurriculum();
%>

<h1>
<%=persona.getNombre() + " " + persona.getApellidos() %>
</h1>
<ul>
<%
	Vector<Empresa> empresas = persona.getEmpresas();
	for (int i = 0; i < empresas.size(); i++)
	{
		%><li><%=empresas.elementAt(i).getNombre()%> 
		<%=empresas.elementAt(i).getDuracion()%></li><%		
	}

%>
</ul>

</body>
</html>