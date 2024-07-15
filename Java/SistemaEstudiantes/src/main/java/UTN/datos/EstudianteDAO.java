package UTN.datos;

import static UTN.conexion.Conexion.getConnection;

import UTN.dominio.Estudiante;

import java.lang.reflect.GenericArrayType;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLOutput;
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

    //metodo por id -> fin by id
    public boolean buscarEstudiantePorId(Estudiante estudiante){
        PreparedStatement ps;
        ResultSet rs;
        Connection con = getConnection();
        String sql = "SELECT * FROM estudiantes WHERE idestudiantes=?";
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, estudiante.getIdEstudiante());
            rs = ps.executeQuery();
            if (rs.next()){
                estudiante.setNombre(rs.getString("nombre"));
                estudiante.setApellido(rs.getString("apellido"));
                estudiante.setTelefono(rs.getString("telefono"));
                estudiante.setEmail(rs.getString("email"));
                return true; //se encontro el regitro
            }//fin del if
        } catch (Exception e){
            System.out.println("Errrror owwwwwo no ecuentro el estudiante  "+e.getMessage());
        }
        finally {
            try{
                con.close();
            } catch (Exception e){
                System.out.println("Noppp error al cerrar tu conexion "+e.getMessage());
            }//fin catch
        }//fin finally
        return false;
    }

    //Metodo agregar un nuevo estudiante
    public boolean agregarEstudiante(Estudiante estudiante){
        PreparedStatement ps;
        Connection con = getConnection();
        String sql = "INSERT INTO estudiantes2024 (nombre, apellido, telefono, email) VALUES (?, ?, ?, ?)";
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, estudiante.getNombre());
            ps.setString(2, estudiante.getApellido());
            ps.setString(3, estudiante.getTelefono());
            ps.setString(4, estudiante.getEmail());
            ps.execute();
            return true;
        }catch (Exception e){
            System.out.println("UIUIUI Error en agregar ese ninio "+e.getMessage());
        }//fin catch
        finally {
            try{
                con.close();
            } catch (Exception e){
                System.out.println("No se pudo mami :/ sigue abierta la conexion: "+e.getMessage());
            }
        }//fin finally
        return false;
    }//fin metodo agregarEstudiante

    //agregamos main para la ejecucion
    public static void main(String[] args) {
        //1.listamos a los estudiantes
        var estudianteDao = new EstudianteDAO();
        System.out.println("Listado de los estudiantes: ");
        List<Estudiante> estudiantes = estudianteDao.listarEstudiantes();
        estudiantes.forEach(System.out::println); //Funcion llamda para imprimir

        //Buscar por Id
        var estudiante1 = new Estudiante(1);
        System.out.println("Antes de buscar, estudiante es : "+estudiante1);
        var encontrado = estudianteDao.buscarEstudiantePorId(estudiante1);
        if (encontrado) //si es true, (se encontro)
            System.out.println("Lo encontre!!! >:DDD adasdfads es: "+estudiante1);
        else //si no
            System.out.println("Pucha, ta dificil no lo encontre :(  "+estudiante1.getIdEstudiante());


    }
}
