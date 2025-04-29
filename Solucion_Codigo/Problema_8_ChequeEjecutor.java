import java.util.Random;

public class Problema_8_ChequeEjecutor {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        double valorAleatorio = 500 + aleatorio.nextDouble() * 4500;

        Problema_8_ChequeBase cheque = new Problema_8_ChequeBase(
            "Luis Mora", "Banco del Pacífico", valorAleatorio
        );

        System.out.println(cheque);
    }
}
