package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import modelo.Agentzia;

public class metodoak {

	public static boolean saioaKonprobatu(String erabiltzailea, String pasahitza) {
		boolean error = true;
		try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3307/db_bidaiaagentzia", "root","");
            Statement sentencia = conexion.createStatement();
            String sql = "SELECT erabiltzailea, pasahitza from agentzia where erabiltzailea = '" + erabiltzailea + "' and pasahitza = '" + pasahitza + "';";
            ResultSet result = sentencia.executeQuery(sql);
            
            while(result.next()) {
            	
	            if(result.getString(1) != null) {
	            	if (result.getString(1).equals(erabiltzailea) && result.getString(2).equals(pasahitza)) {
	            		 error = false;
	            	}else {
	            		 error = true;
	            	}
	            	
	            }
            	
            }

            result.close();
            sentencia.close();
            conexion.close();

        } catch (ClassNotFoundException e) {
            System.out.println("Error al cargar el driver JDBC: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Error en la conexión a la base de datos: " + e.getMessage());
        }
		return error;
	}
	
	
	public static void agentziaberri(Agentzia ag) {
		
		try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3307/db_bidaiaagentzia", "root","");
            Statement sentencia = conexion.createStatement();
            String sql = "insert into agentzia(izena, logoa , markaren_kolorea, erabiltzailea, pasahitza, agentzia_mota_kodea, langile_kopurua_kodea) values ( '" + ag.getIzena()+ "' , '" + ag.getLogo() + "' , '" + ag.getMarkakolore() + "' , '" + ag.getErabiltzaile()  + "' , '" + ag.getPasahitz() + "' , '" + ag.getAgmota() + "' , '" + ag.getLangkop() + "')";
			sentencia.executeUpdate(sql);
            
            sentencia.close();
            conexion.close();

        } catch (ClassNotFoundException e) {
            System.out.println("Error al cargar el driver JDBC: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Error en la conexión a la base de datos: " + e.getMessage());
        }
		
	}
	
	public static String langKopAgentziBilatu(int langindex) {
		String resultado = "";
		try {
           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3307/db_bidaiaagentzia", "root","");
           Statement sentencia = conexion.createStatement();
           String sql = "SELECT kodea from lang_kopurua where kodea like '%"+ langindex + "';";
           ResultSet result = sentencia.executeQuery(sql);
          
           while(result.next()) {
           	
           	resultado = result.getString(1);
	          
	
	            }
           	
          
           result.close();
           sentencia.close();
           conexion.close();
       } catch (ClassNotFoundException e) {
           System.out.println("Error al cargar el driver JDBC: " + e.getMessage());
       } catch (SQLException e) {
           System.out.println("Error en la conexión a la base de datos: " + e.getMessage());
       }
		return resultado;
	}




	public static String agentziaMotaBilatu(int motaindex) {
		String resultado = "";
		try {
           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3307/db_bidaiaagentzia", "root","");
           Statement sentencia = conexion.createStatement();
           String sql = "SELECT kodea from agentzia_motak where kodea like '%"+ motaindex + "';";
           ResultSet result = sentencia.executeQuery(sql);
          
           while(result.next()) {
           	
           	resultado = result.getString(1);
	          
	
	            }
           	
          
           result.close();
           sentencia.close();
           conexion.close();
       } catch (ClassNotFoundException e) {
           System.out.println("Error al cargar el driver JDBC: " + e.getMessage());
       } catch (SQLException e) {
           System.out.println("Error en la conexión a la base de datos: " + e.getMessage());
       }
		return resultado;
	}
	
	public static String koloreaHartu(Agentzia ag) {
		String resultado = "";
		try {
           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3307/db_bidaiaagentzia", "root","");
           Statement sentencia = conexion.createStatement();
           String sql = "SELECT markaren_kolorea from agentzia where erabiltzaile = '"+ ag.getErabiltzaile() + "';";
           ResultSet result = sentencia.executeQuery(sql);
          
           while(result.next()) {
           	
           	resultado = result.getString(1);
	          
	
	            }
           	
          
           result.close();
           sentencia.close();
           conexion.close();
       } catch (ClassNotFoundException e) {
           System.out.println("Error al cargar el driver JDBC: " + e.getMessage());
       } catch (SQLException e) {
           System.out.println("Error en la conexión a la base de datos: " + e.getMessage());
       }
		return resultado;
	}

	
	public static Agentzia agentziaKargatuBD(String erabiltzailea, String pasahitza) {
		Agentzia ag = new Agentzia();
		try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3307/db_bidaiaagentzia", "root","");
            Statement sentencia = conexion.createStatement();
            String sql = "SELECT * from agentzia where erabiltzailea = '" + erabiltzailea + "' and pasahitza = '" + pasahitza + "';";
            ResultSet result = sentencia.executeQuery(sql);
            
            while(result.next()) {
            	
	            ag.setAgmota(result.getString(1));
            	ag.setErabiltzaile(result.getString(2));
            	ag.setKodea(result.getInt(3));
            	ag.setIzena(result.getString(4));
            	ag.setLangkop(result.getString(5));
            	ag.setLogo(result.getString(6));
            	ag.setMarkakolore(result.getString(7));
            	ag.setPasahitz(result.getString(8));
            }

            result.close();
            sentencia.close();
            conexion.close();

        } catch (ClassNotFoundException e) {
            System.out.println("Error al cargar el driver JDBC: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Error en la conexión a la base de datos: " + e.getMessage());
        }
		return ag;
	}
	
}
