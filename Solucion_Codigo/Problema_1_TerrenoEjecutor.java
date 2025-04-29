import java.util.Random;

public class Problema_1_TerrenoEjecutor {
    public static void main(String[] args) {
        Random aleatorio = new Random();

        Problema_1_TerrenoBase terreno = new Problema_1_TerrenoBase();

        terreno.setAncho(10 + aleatorio.nextDouble() * 10); 
        terreno.setLargo(15 + aleatorio.nextDouble() * 10); 
        terreno.setValorMetroCuadrado(50 + aleatorio.nextDouble() * 50); 

        terreno.calcularArea();
        terreno.calcularCostoTerreno();

        System.out.println(terreno);
    }
}
