package laboratorio.model;

public class Estudiante {
     static int totalEstudiantes = 0;

     String nombre;
     String apellido;
     String codigoEstudiante;
     String fechaNacimiento;
     String genero;
     String correo;
     String numeroCelular;

     public Estudiante(
             String nombre, String apellido, String codigoEstudiante, String fechaNacimiento,
             String genero, String correo, String numeroCelular){
          this.nombre = nombre;
          this.apellido = apellido;
          this.codigoEstudiante = codigoEstudiante;
          this.fechaNacimiento = fechaNacimiento;
          this.genero = genero;
          this.correo = correo;
          this.numeroCelular = numeroCelular;
     }

     public void mostrarDatosEstudiante(){
          System.out.println("Nombre completo: " + getNombreCompleto());
          System.out.println("Código: " + codigoEstudiante);
          System.out.println("Fecha de nacimiento: " + fechaNacimiento);
          System.out.println("Género: " + genero);
          System.out.println("Contacto: " + contactoDeEstudiante());
     }

     public String getNombreCompleto(){
          return nombre + " " + apellido;
     }

     private String contactoDeEstudiante(){
          return correo + " | " + numeroCelular;
     }
}