public class Problema_6_ProfesorBase {
    private String nombre;
    private String apellido;
    private String cedula;
    private double sueldoBasico;
    private double sueldoTotal;

    public Problema_6_ProfesorBase(String nom, String ape, String ci, double sueldoB) {
        nombre = nom;
        apellido = ape;
        cedula = ci;
        sueldoBasico = sueldoB;
        calcularSueldoTotal();
    }

    public void calcularSueldoTotal() {
        sueldoTotal = sueldoBasico + (sueldoBasico * 0.2);
    }

    public String toString() {
        return "Nombre: " + nombre + " " + apellido + "\n" +
               "Cédula: " + cedula + "\n" +
               "Sueldo Básico: $" + sueldoBasico + "\n" +
               "Sueldo Total: $" + sueldoTotal;
    }
}
