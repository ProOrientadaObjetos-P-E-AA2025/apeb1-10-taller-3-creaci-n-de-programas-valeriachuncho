public class Problema_8_ChequeBase {
    private String nombreCliente;
    private String nombreBanco;
    private double valorCheque;
    private double comisionBanco;

    public Problema_8_ChequeBase(String cliente, String banco, double valor) {
        nombreCliente = cliente;
        nombreBanco = banco;
        valorCheque = valor;
        calcularComision();
    }

    public void calcularComision() {
        comisionBanco = valorCheque * 0.003;
    }

    public String toString() {
        return "Cliente: " + nombreCliente + "\n" +
               "Banco: " + nombreBanco + "\n" +
               "Valor del Cheque: $" + valorCheque + "\n" +
               "Comisión del Banco: $" + comisionBanco;
    }
}
