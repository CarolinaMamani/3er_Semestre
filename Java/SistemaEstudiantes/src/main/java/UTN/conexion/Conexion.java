package UTN.conexion;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;

public class Conexion {
    public static Connection getConnection(){
        Connection conexion = null;
        //variables para conectarnos a la base de datos
        var baseDatos = "estudiantes2024";
        var url = "jdbx:mysql://localhost:3306/"+baseDatos;
        var usuario = "rood";
        var password = "admin";

        //cargamos la clase del driver de mysql en memoria
        Class.forName("comm.mysql.cj.jdbc.Driver");
        conexion = DriverManager.getConnection(url, usuario, password);
        

    }
}
