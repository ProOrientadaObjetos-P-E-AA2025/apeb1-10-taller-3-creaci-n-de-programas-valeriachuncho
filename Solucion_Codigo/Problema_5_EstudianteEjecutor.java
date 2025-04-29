import java.util.Random;

public class Problema_5_EstudianteEjecutor {
    public static void main(String[] args) {
        Random aleatorio = new Random();

        String nombre = "Ana Torres";
        double c1 = 5 + aleatorio.nextDouble() * 5;
        double c2 = 5 + aleatorio.nextDouble() * 5;
        double c3 = 5 + aleatorio.nextDouble() * 5;

        Problema_5_EstudianteBase estudiante = new Problema_5_EstudianteBase(nombre, c1, c2, c3);

        System.out.println(estudiante);
    }
}
