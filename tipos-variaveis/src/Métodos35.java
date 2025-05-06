public class Métodos35 {
    public static void main(String[] args) throws Exception {
            
        Métodos30 smartTV = new Métodos30();

        smartTV.aumentarcanal();
        smartTV.aumentarcanal();
        smartTV.aumentarcanal();
        smartTV.diminuircanal();

        smartTV.diminuirvolume();
        smartTV.diminuirvolume();
        smartTV.diminuirvolume();
        smartTV.aumentarvolume();

        System.out.println("TV Ligada?" + smartTV.ligada);
        System.out.println("Canal Atual:" + smartTV.canal);
        System.out.println("Volume Atual" + smartTV.volume);

        smartTV.ligar ();
        
        System.out.println("Novo Status -> TV Ligada?" + smartTV.ligada);

        smartTV.desligar ();
        
        System.out.println("Novo Status -> TV Ligada?" + smartTV.ligada);
    }
}
