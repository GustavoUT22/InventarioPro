package laboratorio.model;

public class Prestamo {

    static int totalPrestamos = 0;
    static double totalPenalidades = 0.0;
    static int totalConRetraso = 0;

    String codigoPrestamo;
    Estudiante estudiante;
    Equipo equipo;
    int diasDePrestamo;
    int diasDeRetraso;

    public Prestamo(String codigoPrestamo, Estudiante estudiante,Equipo equipo, int diasDePrestamo, int diasDeRetraso) {
        this.codigoPrestamo = codigoPrestamo;
        this.estudiante = estudiante;
        this.equipo = equipo;
        this.diasDePrestamo = diasDePrestamo;
        this.diasDeRetraso = diasDeRetraso;

        totalPrestamos++;
        totalPenalidades += calcularPenalidad();
        if (diasDeRetraso > 0) {
            totalConRetraso++;
        }
    }

    private String estadoRetraso() {
        if (diasDeRetraso == 0) {
            return "A tiempo";
        } else {
            return "Retrasado " + diasDeRetraso + " día(s)";
        }
    }

    public double calcularPenalidad() {
        return diasDeRetraso * 5.0;
    }

    public boolean validarPrestamo() {
        return equipo.estaDisponible();
    }

    public void mostrarDatosDePrestamo() {
        System.out.println("*****DATOS DE PRESTAMO*****");
        System.out.println("Código: " + codigoPrestamo);
        System.out.println("Estudiante: " + estudiante.getNombreCompleto());
        System.out.println("Equipo: " + equipo.getNombre());
        System.out.println("Días de préstamo: " + diasDePrestamo);
        System.out.println("Días de retraso: " + diasDeRetraso);
        System.out.println("Estado: " + estadoRetraso());
        System.out.println("Penalidad: S/. " + calcularPenalidad());
    }

    public static void mostrarResumenJornada() {
        System.out.println("*****RESUMEN DE LA JORNADA*****");
        System.out.println("Total préstamos: " + totalPrestamos);
        System.out.println("Total penalidades: S/. " + totalPenalidades);
        System.out.println("Con retraso: " + totalConRetraso);
    }
}