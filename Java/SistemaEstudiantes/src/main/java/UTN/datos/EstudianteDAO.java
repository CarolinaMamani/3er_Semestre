package UTN.datos;

import static UTN.conexion.Conexion.getConnection;

import UTN.dominio.Estudiante;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class EstudianteDAO {
    //Metodo listar
    public List<Estudiante> listarEstudiantes(){
        List<Estudiante> estudiantes = new ArrayList<>();

        //creamos algunos objetos que son necesarios para comunicarnos con la base de datos
        PreparedStatement ps; //envia la sentendia de sql  hacia la base de datos
        ResultSet rs; //objeto que permite obtener el resultado desde las base de datos

        //creamos un objeto de tipo conexion
        Connection con = getConnection();
        String sql = "SELECT * FROM estudiantes ORDER BY idestudiantes";
        try{
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                var estudiante = new Estudiante();
                estudiante.setIdEstudiante(rs.getInt("idestudiantes"));
                estudiante.setNombre(rs.getString("nombre"));
                estudiante.setApellido(rs.getString("apellido"));
                estudiante.setTelefono(rs.getString("telefono"));
                estudiante.setEmail(rs.getString("email"));
                //falta agregarlos a la lista
                estudiantes.add(estudiante);
            }

        } catch (Exception e){
            System.out.println("Ehhh error uwu "+e.getMessage());
        }
        finally {
            try{
                con.close();
            }catch (Exception e){
                System.out.println("Ne errrrror al cerrar la conexion");
            }
        }//fin finally
        return estudiantes;
    }//fin del metodo Listar estudiante

    //agregamos main para la ejecucion
    public static void main(String[] args) {
        //1.listamos a los estudiantes
        var estudianteDao = new EstudianteDAO();
        System.out.println("Listado de los estudiantes: ");
        List<Estudiante> estudiantes = estudianteDao.listarEstudiantes();
        estudiantes.forEach(System.out::println); //Funcion llamda para imprimir

    }
}
