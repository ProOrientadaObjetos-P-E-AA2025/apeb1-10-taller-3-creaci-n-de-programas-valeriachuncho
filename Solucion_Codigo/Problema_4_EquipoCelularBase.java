public class Problema_4_EquipoCelularBase {
    private String sistemaOperativo;
    private double tamañoPantalla;
    private double costoInicial;
    private double ivaPorcentaje;
    private double ivaCosto;
    private double costoFinal;
    private String direccionMac;
    private String informacionImei;

    public Problema_4_EquipoCelularBase(String so, double pantalla, double costoIni, double ivaPorc, String mac, String imei) {
        sistemaOperativo = so;
        tamañoPantalla = pantalla;
        costoInicial = costoIni;
        ivaPorcentaje = ivaPorc;
        direccionMac = mac;
        informacionImei = imei;
        calcularIvaCosto();
        calcularCostoFinal();
    }

    public void calcularIvaCosto() {
        ivaCosto = (costoInicial * ivaPorcentaje) / 100;
    }

    public void calcularCostoFinal() {
        costoFinal = costoInicial + ivaCosto;
    }

    public String toString() {
        return "Sistema Operativo: " + sistemaOperativo + "\n" +
               "Tamaño de Pantalla: " + tamañoPantalla + " pulgadas\n" +
               "Costo Inicial: $" + costoInicial + "\n" +
               "IVA (" + ivaPorcentaje + "%): $" + ivaCosto + "\n" +
               "Costo Final: $" + costoFinal + "\n" +
               "Dirección MAC: " + direccionMac + "\n" +
               "Información IMEI: " + informacionImei;
    }
}
