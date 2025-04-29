public class Problema_1_TerrenoBase {
    private double ancho;
    private double largo;
    private double valorMetroCuadrado;
    private double area;
    private double costoTerreno;

    public void setAncho(double a) {
        ancho = a;
    }

    public void setLargo(double l) {
        largo = l;
    }

    public void setValorMetroCuadrado(double v) {
        valorMetroCuadrado = v;
    }

    public void calcularArea() {
        area = largo * ancho;
    }

    public void calcularCostoTerreno() {
        costoTerreno = area * valorMetroCuadrado;
    }

    public String toString() {
        return "Terreno:\nAncho:  "+ancho+"\nLargo: "+largo+"\nValor: "+valorMetroCuadrado+"\nÁrea: "+area+"\nCosto: "+costoTerreno;
    }
}
