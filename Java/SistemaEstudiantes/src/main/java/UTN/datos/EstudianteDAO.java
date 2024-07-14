package UTN.datos;

import static UTN.conexion.Conexion.getConnection;

import UTN.conexion.Conexion;
import UTN.dominio.Estudiante;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class EstudianteDAO {
    //Metodo listar
    public List<Estudiante> listar(){
        List<Estudiante> estudiantes = new ArrayList<>();

        //creamos algunos objetos que son necesarios para comunicarnos con la base de datos
        PreparedStatement ps; //envia la sentendia de sql  hacia la base de datos
        ResultSet rs; //objeto que permite obtener el resultado desde las base de datos

        //creamos un objeto de tipo conexion
        Conexion con = getConnection();
        String sql = "SELECT * FROM estudiantes2024"
    }
}
