package com.ability.persistence;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PersistenceUtil {
	private static Connection conection;
	private static ResultSet resultSet;
	private static Statement statement;

	public static ResultSet realizaConsultaAppsportal(String consulta) throws SQLException, ClassNotFoundException {		
		
			conection = Conexion.open(Conexion.DATA_SOURCE_APPSPORTAL);
			
		try 
		{	
			statement = conection.createStatement();
			resultSet = statement.executeQuery(consulta);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("ERROR PRINCIPAL: " + e.getMessage());
		}
		
		return resultSet;
	}
	
	public static ResultSet realizaConsultaDespachos(String consulta) throws SQLException, ClassNotFoundException {		
		
		conection = Conexion.open(Conexion.DATA_SOURCE_DESPACHOS);
		
	try 
	{	
		statement = conection.createStatement();
		resultSet = statement.executeQuery(consulta);
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("ERROR PRINCIPAL: " + e.getMessage());
	}
	
	return resultSet;
}
	
	public static void terminaOperacion() throws SQLException {
		if (resultSet != null) {
			resultSet.close();
		}
		if (statement != null) {
			statement.close();
		}
		if (conection != null) {
			conection.close();
		}

		resultSet = null;
		statement = null;
		conection = null;
	}
}
