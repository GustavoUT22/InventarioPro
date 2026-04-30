package laboratorio.model;

public class Equipo {
    static int totalDeEquipos = 0;

    String codigo;
    String nombre;
    String tipo;
    boolean disponible = true;

    public Equipo(String codigo, String nombre, String tipo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipo = tipo;
        totalDeEquipos++;
    }

    public void mostrarEquipo() {
        System.out.println("Codigo: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Categoría : " + tipo);
        System.out.println("Estado    : " + (disponible ? "Disponible" : "No disponible"));
    }

    public String getNombre (){
        return nombre;
    }

    public String gettipo (){
        return tipo;
    }

    public boolean estaDisponible() {
        return disponible;
    }

    public void prestar() {
        disponible = false;
    }

    public void devolver() {
        disponible = true;
    }
}
