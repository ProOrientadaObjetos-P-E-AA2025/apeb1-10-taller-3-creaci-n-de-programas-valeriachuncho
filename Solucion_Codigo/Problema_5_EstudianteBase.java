public class Problema_5_EstudianteBase {
    private String nombre;
    private double calificacion1;
    private double calificacion2;
    private double calificacion3;
    private double promedio;
    private String estado;

    public Problema_5_EstudianteBase(String nom, double c1, double c2, double c3) {
        nombre = nom;
        calificacion1 = c1;
        calificacion2 = c2;
        calificacion3 = c3;
        calcularPromedio();
        determinarEstado();
    }

    public void calcularPromedio() {
        promedio = (calificacion1 + calificacion2 + calificacion3) / 3;
    }

    public void determinarEstado() {
        if (promedio >= 6.5) {
            estado = "Aprobado";
        } else {
            estado = "Reprobado";
        }
    }

    public String toString() {
        return "Nombre del Estudiante: " + nombre + "\n" +
               "Calificación 1: " + calificacion1 + "\n" +
               "Calificación 2: " + calificacion2 + "\n" +
               "Calificación 3: " + calificacion3 + "\n" +
               "Promedio: " + promedio + "\n" +
               "Estado: " + estado;
    }
}
