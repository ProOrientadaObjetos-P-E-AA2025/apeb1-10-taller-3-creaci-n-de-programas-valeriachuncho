public class Problema_2_EquivalenteHoraEjecutor {
    public static void main(String[] args) {
        int horasAleatorias = (int) (Math.random() * 24) + 1; 

        Problema_2_EquivalenteHoraBase hora = new Problema_2_EquivalenteHoraBase(horasAleatorias);
        System.out.println(hora);
    }
}
