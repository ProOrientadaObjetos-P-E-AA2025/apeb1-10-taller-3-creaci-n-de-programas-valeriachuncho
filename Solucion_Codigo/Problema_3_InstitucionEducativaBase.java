public class Problema_3_InstitucionEducativaBase {
    private String nombre;
    private String tipoInstitucion;
    private int numeroAlumnos;
    private int numeroDocentes;
    private int numeroSedes;
    private double gastoPorEstudiante;
    private double presupuesto;

    public Problema_3_InstitucionEducativaBase(String n, String tipo, int alumnos, int docentes, int sedes, double gasto) {
        nombre = n;
        tipoInstitucion = tipo;
        numeroAlumnos = alumnos;
        numeroDocentes = docentes;
        numeroSedes = sedes;
        gastoPorEstudiante = gasto;
        calcularPresupuesto();
    }

    public void calcularPresupuesto() {
        presupuesto = numeroAlumnos * gastoPorEstudiante;
    }

    public String toString() {
        return "Nombre: " + nombre + "\n" +
               "Tipo de Institución: " + tipoInstitucion + "\n" +
               "Número de Alumnos: " + numeroAlumnos + "\n" +
               "Número de Docentes: " + numeroDocentes + "\n" +
               "Número de Sedes: " + numeroSedes + "\n" +
               "Gasto por Estudiante: $" + gastoPorEstudiante + "\n" +
               "Presupuesto Total: $" + presupuesto;
    }
}
