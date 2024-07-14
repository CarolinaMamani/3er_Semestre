package UTN.conexion;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    public static Connection getConnection(){
        Connection conexion = null;
        //variables para conectarnos a la base de datos
        var baseDatos = "estudiantes2024";
        var url = "jdbx:mysql://localhost:3306/"+baseDatos;
        var usuario = "rood";
        var password = "admin";

        //cargamos la clase del driver de mysql en memoria
        try{
            Class.forName("comm.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(url, usuario, password);
        } catch (ClassNotFoundException | SQLException e){
            System.out.println("ocurrio un error en la conexion"+e.getMessage());
        }//fin catch
        return conexion;

    }//fin metodo de connection
}