package konexioa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BD_Konexioa {
String respuesta;
public Connection konektatuta;

public BD_Konexioa() {

}

//Metodo para crear la konexion con la base de datos

public void konexioaIreki() {
try {

//driver para poder conectarse con la base de datos

Class.forName("com.mysql.cj.jdbc.Driver");

//url de la base de datos usuario y contraseña

String url = "jdbc:mysql://localhost:3307/db_bidaiaagentzia";
String user = "root";
String pass = "";

//pilla la url el usuario y contraseña y intenta logearse en la base de datos

konektatuta = DriverManager.getConnection(url, user, pass);

} catch (ClassNotFoundException | SQLException e) {
e.printStackTrace();
}
}

//metodo para cerrar la conexión de la base de datos

public void konexioaItxi() {
try {

konektatuta.close();
} catch (SQLException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
}
    }