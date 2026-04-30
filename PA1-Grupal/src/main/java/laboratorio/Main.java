package laboratorio;

import laboratorio.model.Estudiante;
import laboratorio.model.Equipo;
import laboratorio.model.Prestamo;

public class Main {
    public static void main(String[] args){

        mostrarBienvenida();

        Estudiante estudiante1 = new Estudiante(
                "Juan", "García", "2024001",
                "22/01/2005", "Masculino",
                "juangarcia@gmail.com", "987654321");
        estudiante1.getNombreCompleto();
        estudiante1.mostrarDatosEstudiante();


        Equipo equipo1 = new Equipo("EQ001", "Laptop Dell", "Laptop");


        Prestamo prestamo1 = new Prestamo("P001", estudiante1, equipo1, 3, 2);

        int opcion = 5;

        mostrarMenu();

        switch (opcion) {
            case 1:
                prestamo1.mostrarDatosDePrestamo();
                break;
            case 2:
                estudiante1.mostrarDatosEstudiante();
                break;
            case 3:
                equipo1.mostrarEquipo();
                break;
            case 4:
                System.out.println("\n--- DISPONIBILIDAD ---");
                if (prestamo1.validarPrestamo()) {
                    System.out.println(equipo1.getNombre() + " : Disponible");
                } else {
                    System.out.println(equipo1.getNombre() + " : No disponible");
                }
                break;
            case 5:
                Prestamo.mostrarResumenJornada();
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }

    public static void mostrarBienvenida() {
        System.out.println("================================================");
        System.out.println("====BIENVENIDOS A NUESTRA APP DE PRESTAMOS======");
        System.out.println("================================================");
    }

    public static void mostrarMenu() {
        System.out.println("\n¿Qué hacemos hoy?");
        System.out.println("1. Ver préstamo");
        System.out.println("2. Ver estudiante");
        System.out.println("3. Ver equipo");
        System.out.println("4. Ver disponibilidad del equipo");
        System.out.println("5. Ver resumen de la jornada");
    }
}