package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DAO {

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
	
	public static String[] langileKopurua() {
        String[] deskboxarray = new String[4];
        try {
            // Cargar el driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establecemos la conexion con la BD
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3307/db_bidaiaagentzia", "root","");

            // Preparamos la consultaç
            Statement sentencia = conexion.createStatement();
            String sql = "SELECT deskribapena FROM lang_kopurua";
            ResultSet result = sentencia.executeQuery(sql);

            // Recorremos el resultado para visualizar cada fla
            // Se hace un bucle mientras haya registros y se van visualizando
            deskboxarray[0] = "";
            int i = 1;
            while (result.next()) {
                deskboxarray [i] = result.getString(1);
                i++;
            }

            result.close(); // Cerrar ResultSet
            sentencia.close(); // Cerrar Statement
            conexion.close(); // Cerrar conexion

        } catch (ClassNotFoundException cn) {
            cn.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return deskboxarray;
    }
    
    
    public static String[] agentziaMota() {
        String[] deskboxarray = new String[4];
        try {
            // Cargar el driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establecemos la conexion con la BD
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3307/db_bidaiaagentzia", "root","");

            // Preparamos la consultaç
            Statement sentencia = conexion.createStatement();
            String sql = "SELECT deskribapena FROM agentzia_motak";
            ResultSet result = sentencia.executeQuery(sql);

            // Recorremos el resultado para visualizar cada fla
            // Se hace un bucle mientras haya registros y se van visualizando
            deskboxarray[0] = "";
            int i = 1;
            while (result.next()) {
                deskboxarray [i] = result.getString(1);
                i++;
            }

            result.close(); // Cerrar ResultSet
            sentencia.close(); // Cerrar Statement
            conexion.close(); // Cerrar conexion

        } catch (ClassNotFoundException cn) {
            cn.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return deskboxarray;
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
           String sql = "SELECT markaren_kolorea from agentzia where erabiltzailea = '"+ ag.getErabiltzaile() + "';";
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
            	
            	
	            
            	
            	ag.setKodea(result.getInt(1));
            	ag.setIzena(result.getString(2));
            	ag.setLogo(result.getString(3));
            	ag.setMarkakolore(result.getString(4));
            	ag.setErabiltzaile(result.getString(5));
            	ag.setPasahitz(result.getString(6));
            	ag.setAgmota(result.getString(7));
            	ag.setLangkop(result.getString(8));
            	
            	
            	
            	
            }

            result.close();
            sentencia.close();
            conexion.close();

        } catch (ClassNotFoundException e) {
            System.out.println("Error al cargar el driver JDBC: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Error en la conexión a la base de datos: " + e.getMessage());
            System.out.println(ag.getLogo());
        }
		return ag;
	}
	
	public static ArrayList<Bidai> bidaiKargatuDB(Agentzia ag) {
		Bidai bidaia = null;
		Ekitaldi eki = null;
		ArrayList<Bidai> bidaiak = new ArrayList();
		ag.setBidaiak(bidaiak);
		try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3307/db_bidaiaagentzia", "root","");
            Statement sentencia = conexion.createStatement();
            String sql = "SELECT * from bidaiak where agentzia_kodea = '" + ag.getKodea()+ "';";
            ResultSet result = sentencia.executeQuery(sql);
            ResultSet resulteki = null;            
           
            
            while(result.next()) {
            	
            		bidaia = new Bidai(result.getInt(1), result.getString(2), ag.getKodea(), result.getString(3), result.getString(6), result.getString(7), result.getString(4), result.getString(5), result.getString(9));
            		String sqleki = "SELECT * from ekitaldiak eki left outer join ostatua os on eki.id_ekitaldia = os.id_ostatua left outer join Jarduerak jar on eki.id_ekitaldia = jar.id_jarduera left outer join joaneko_hegaldia jo on eki.id_ekitaldia = jo.id_hegaldia left outer join joan_etorriko_hegaldia joet on eki.id_ekitaldia = joet.id_hegaldia where eki.id_bidaia = '" + result.getInt(1)+"';";
            		
            		PreparedStatement preparedStatement = conexion.prepareStatement(sqleki);
    	            resulteki = preparedStatement.executeQuery();
             
            		while(resulteki.next()) {
            		
	            		if(resulteki.getInt(4) >= 1){//ostatua da?
	            			eki = new Ekitaldi(resulteki.getInt(4), resulteki.getString(2), resulteki.getString(3), resulteki.getString(6), resulteki.getInt(7), resulteki.getString(5), resulteki.getString(8), resulteki.getString(9), resulteki.getString(10));
	            			bidaia.sartuEkitaldia(eki);
	            			
	            		}else if(resulteki.getInt(11) >= 1) {//jarduera da?
	            			eki = new Ekitaldi(resulteki.getInt(11), resulteki.getString(2), resulteki.getString(3), resulteki.getString(13), resulteki.getString(14),resulteki.getInt(15));
	            			bidaia.sartuEkitaldia(eki);
	            			
	            		}else if (resulteki.getInt(25) >= 1) {//joan etorrikoa da?
	            			eki = new Ekitaldi(resulteki.getInt(16), resulteki.getString(2), resulteki.getString(3), resulteki.getInt(17),  resulteki.getString(24), resulteki.getString(22), resulteki.getString(23), resulteki.getInt(20), resulteki.getString(19), resulteki.getString(18),  resulteki.getInt(21),  resulteki.getInt(26),  resulteki.getString(30),  resulteki.getString(22), resulteki.getString(23), resulteki.getInt(21), 0, resulteki.getInt(29), resulteki.getString(28), resulteki.getString(27));
	            			bidaia.sartuEkitaldia(eki);
	            			
	            		}else if(resulteki.getInt(16) >= 1){ //joanekoa da?
	            			eki = new Ekitaldi(resulteki.getInt(16), resulteki.getString(2), resulteki.getString(3), resulteki.getInt(17),  resulteki.getString(24), resulteki.getString(22), resulteki.getString(23), resulteki.getInt(20), resulteki.getString(19), resulteki.getString(18),  resulteki.getInt(21));
	            			bidaia.sartuEkitaldia(eki);
	            		}
	            		
            		}            		
            		
            		
            		                    
            
            		ag.sartuBidaia(bidaia);

           
            }
            if(resulteki != null)
            resulteki.close();
            sentencia.close();
            conexion.close();
            result.close();
            
           
        } catch (ClassNotFoundException e) {
            System.out.println("Error al cargar el driver JDBC: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Error en la conexión a la base de datos: " + e.getMessage());
            System.out.println(e.getLocalizedMessage());
            System.out.println(e.getSQLState());
          
        }
		return ag.getBidaiak();
	}
		
	public static void bidaiGordeDB(Agentzia ag, Bidai bidaia) {
			
			try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3307/db_bidaiaagentzia", "root","");
	            Statement sentencia = conexion.createStatement();
	            String sql = "insert into bidaiak (izena, deskribapena, hasiera_data, amaiera_data, ez_barne_zerbitzuak, bidaia_mota_kodea, agentzia_kodea, herrialdeak_kodea) values ( '" + bidaia.getIzena()+ "' , '" + bidaia.getDesk() + "' , '" + bidaia.getHasidata() + "' , '" + bidaia.getAmaidata()  + "' , '" + bidaia.getZerbez() + "' , '" + bidaia.getBidmota() + "' , '" + bidaia.getAgkode()+ "' , '" + bidaia.getHerrihelmuga()+ "')";
				sentencia.executeUpdate(sql);
	            
	            sentencia.close();
	            conexion.close();
	
	        } catch (ClassNotFoundException e) {
	            System.out.println("Error al cargar el driver JDBC: " + e.getMessage());
	        } catch (SQLException e) {
	            System.out.println("Error en la conexión a la base de datos: " + e.getMessage());
	        }
			
		}
	
	
	
	public static void ostatuaGordeDB(Agentzia ag, Bidai bidaia, Ekitaldi eki) {
		PreparedStatement sentencia = null ;
		Connection conexion = null;
		ResultSet result = null;
		try {
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        conexion = DriverManager.getConnection("jdbc:mysql://localhost:3307/db_bidaiaagentzia", "root","");
	        
	        String sql = "insert into ekitaldiak values ( '"+ eki.getEkikode() +"' , '" + eki.getIzena() +"' , '" +eki.getBidaikode() + "')";
			sentencia = conexion.prepareStatement(sql);
			sentencia.executeUpdate(sql);
			sql = "SELECT max(id_ekitaldia) from ekitaldiak;";
            result = sentencia.executeQuery(sql);
          
            while(result.next()) {
            	sql = "insert into ostatua (id_ostatua, hotelaren_izena, hiria, prezioa,sarrera_eguna, irteera_eguna, logela_mota_kodea) values ( '"+result.getInt(1) +"' , '" + eki.getHotizena() +"' , '" + eki.getHiria() + "' , '" + eki.getOsprezio() + "' , '" + eki.getOssardata()  + "' , '" + eki.getOsirtdata()+ "' , '" + eki.getLogelamotakod() + "')";
            	
            }
			sentencia.executeUpdate(sql);
	        
	        
	
	    } catch (ClassNotFoundException e) {
	        System.out.println("Error al cargar el driver JDBC: " + e.getMessage());
	    } catch (SQLException e) {
	        System.out.println("Error en la conexión a la base de datos: " + e.getMessage());
	    }finally {
	    	try {
				sentencia.close();
				conexion.close();
				result.close();
	    }catch (SQLException e) {
			
	    } 
				
	    }
	        
		
	}
	
	
	
	public static void jardueraGordeDB(Agentzia ag, Bidai bidaia, Ekitaldi eki) {
		PreparedStatement sentencia = null ;
		Connection conexion = null;
		ResultSet result = null;
		try {
		        
	          
	            
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        
	        conexion = DriverManager.getConnection("jdbc:mysql://localhost:3307/db_bidaiaagentzia", "root","");
	        
	        String sql = "insert into ekitaldiak values ( '"+ eki.getEkikode() +"' , '" + eki.getIzena() +"' , '" + eki.getBidaikode() + "')";
	        sentencia = conexion.prepareStatement(sql);
			sentencia.executeUpdate(sql);
			sql = "SELECT max(id_ekitaldia) from ekitaldiak;";
	        result = sentencia.executeQuery(sql);
	         
	        while(result.next()) {
	        	  sql = "insert into jarduerak values ( " + result.getInt(1)+" , '" + eki.getIzena()+"' , '" + eki.getJardesk() + "' , '" + eki.getJardata() + "' , " + eki.getJarprezio()+ ")";
	        		
	        
	            }
	        sentencia = conexion.prepareStatement(sql);
	        sentencia.executeUpdate(sql); 
	        	
	        sentencia.close();
	        conexion.close();
	        result.close();
	
	    } catch (ClassNotFoundException e) {
	        System.out.println("Error al cargar el driver JDBC: " + e.getMessage());
	    } catch (SQLException e) {
	        System.out.println("Error en la conexión a la base de datos: " + e.getMessage());
	    }
		
	}
	// solo tiens que crear un metodo 
    public static ArrayList<String> bidaiaMota() {
        ArrayList<String> bidaiaMota = new ArrayList();
        try {
            // Cargar el driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establecemos la conexion con la BD
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3307/db_bidaiaagentzia", "root","");

            // Preparamos la consultaç
            Statement sentencia = conexion.createStatement();
            String sql = "SELECT deskribapena FROM bidaia_motak";
            ResultSet result = sentencia.executeQuery(sql);

            // Recorremos el resultado para visualizar cada fla
            // Se hace un bucle mientras haya registros y se van visualizando
           
            while (result.next()) {
                bidaiaMota.add (result.getString(1));
            }

            result.close(); // Cerrar ResultSet
            sentencia.close(); // Cerrar Statement
            conexion.close(); // Cerrar conexion

        } catch (ClassNotFoundException cn) {
            cn.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return bidaiaMota;
    }
    
    public static String bidaiaMotaBilatu(String desk) {
		String resultado = "";
		try {
           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3307/db_bidaiaagentzia", "root","");
           Statement sentencia = conexion.createStatement();
           String sql = "SELECT kodea from bidaia_motak where deskribapena like '%"+ desk + "';";
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
    
    public static ArrayList<String> herrialdeMota() {
        ArrayList<String> herrialdeMota = new ArrayList();
        try {
            // Cargar el driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establecemos la conexion con la BD
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3307/db_bidaiaagentzia", "root","");

            // Preparamos la consultaç
            Statement sentencia = conexion.createStatement();
            String sql = "SELECT herrialdeak FROM herrialdeak";
            ResultSet result = sentencia.executeQuery(sql);

            // Recorremos el resultado para visualizar cada fla
            // Se hace un bucle mientras haya registros y se van visualizando
           
            while (result.next()) {
                herrialdeMota.add (result.getString(1));
            }

            result.close(); // Cerrar ResultSet
            sentencia.close(); // Cerrar Statement
            conexion.close(); // Cerrar conexion

        } catch (ClassNotFoundException cn) {
            cn.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return herrialdeMota;
    }
    
    public static ArrayList<String[]>herrialdeakKargatu() {
		ArrayList<String[]> herrialdeak = new ArrayList();
		try {
           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3307/db_bidaiaagentzia", "root","");
           Statement sentencia = conexion.createStatement();
           String sql = "SELECT * from herrialdeak;";
           ResultSet result = sentencia.executeQuery(sql);
          
           while(result.next()) {
        
           	String[] infoherri = new String[]{result.getString(1),result.getString(2)};
	          herrialdeak.add(infoherri);
	
	           
           }
           	
          
           result.close();
           sentencia.close();
           conexion.close();
       } catch (ClassNotFoundException e) {
           System.out.println("Error al cargar el driver JDBC: " + e.getMessage());
       } catch (SQLException e) {
           System.out.println("Error en la conexión a la base de datos: " + e.getMessage());
       }
		Herrialde herri = new Herrialde();
		
		herri.setHerrialdearray(herrialdeak);
		
		return herrialdeak;
	}
	
    public static ArrayList<Aireportu> aireportuakKargatuDB() {
        ArrayList<Aireportu> aireportuak = new ArrayList<Aireportu>();
        try {
            // Cargar el driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establecemos la conexion con la BD
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3307/db_bidaiaagentzia", "root","");

            // Preparamos la consultaç
            Statement sentencia = conexion.createStatement();
            String sql = "SELECT * FROM iata";
            ResultSet result = sentencia.executeQuery(sql);
           
            while (result.next()) {
            	Aireportu airpt = new Aireportu(result.getString(1), result.getString(2));
            	aireportuak.add(airpt);
            }

            result.close(); // Cerrar ResultSet
            sentencia.close(); // Cerrar Statement
            conexion.close(); // Cerrar conexion

        } catch (ClassNotFoundException cn) {
            cn.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return aireportuak;
    }
		
}
