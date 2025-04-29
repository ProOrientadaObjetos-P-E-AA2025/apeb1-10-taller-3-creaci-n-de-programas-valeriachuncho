public class Problema_7_AutomotorBase {
    private String cedulaDueno;
    private String marcaVehiculo;
    private int anioFabricacion;
    private double valorVehiculo;
    private double valorMatricula;

    public Problema_7_AutomotorBase(String cedula, String marca, int anio, double valor) {
        cedulaDueno = cedula;
        marcaVehiculo = marca;
        anioFabricacion = anio;
        valorVehiculo = valor;
        calcularValorMatricula();
    }

    public void calcularValorMatricula() {
        int aniosAntiguedad = 2025 - anioFabricacion;
        valorMatricula = (valorVehiculo * 0.002) * aniosAntiguedad;
    }

    public String toString() {
        return "Cédula del Dueño: " + cedulaDueno + "\n" +
               "Marca del Vehículo: " + marcaVehiculo + "\n" +
               "Año de Fabricación: " + anioFabricacion + "\n" +
               "Valor del Vehículo: $" + valorVehiculo + "\n" +
               "Valor de la Matrícula: $" + valorMatricula;
    }
}
