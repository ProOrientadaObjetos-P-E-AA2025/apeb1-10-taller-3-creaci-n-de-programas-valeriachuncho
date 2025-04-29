public class Problema_2_EquivalenteHoraBase {
    private int horas;
    private int minutos;
    private int segundos;
    private int dias;

    public Problema_2_EquivalenteHoraBase(int horas) {
        this.horas = horas;
        convertirHoras();
    }

    public void convertirHoras() {
        minutos = horas * 60;
        segundos = minutos * 60;
        dias = horas / 24;
    }

    public String toString() {
        return "Equivalente de " + horas + " horas:\n" +
               "Minutos: " + minutos + "\n" +
               "Segundos: " + segundos + "\n" +
               "Días: " + dias;
    }
}
