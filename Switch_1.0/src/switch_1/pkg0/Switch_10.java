package switch_1.pkg0;

//No borren ningun paquete por favor f
import Clases.Conexion;
import java.sql.Timestamp;

public class Switch_10 {

    public static void main(String[] args) {
        try {
            Conexion con = new Conexion("jdbc:mysql://localhost:3306/test","root","");
            
            //AlumnoData alumnoData = new AlumnoData(con);
            //PrestamoData prestamoData = new PrestamoData(con);
            //LibroData libroData = new LibroData(con);
             
            //String fec = "31-03-2016";
            //LocalDate date3 = LocalDate.parse("2018-10-30");
            
            //Alumno a = new Alumno("Juan Gomez","juangomez@gmail.com");
            //Alumno b = new Alumno("Pepito Escudero","pepitoescudero@gmail.com");
            
            //Libro l = libroData.getLibrosById(2);
            //List<Prestamo> prestamos = prestamoData.obtenerPrestamosByLibro(l);
            //Prestamo.mostrarPrestamosPlus(prestamos,con);
            
            con.close();
        }   
        catch (Exception e){
            System.out.println("Error al intentar conectar a la base de datos " + e.getMessage());
        }

        //VentanaPrincipal vp = new VentanaPrincipal();
        //vp.setVisible(true);
    }
}