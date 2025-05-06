public class Métodos32 {
        public static void main(String[] args) throws Exception {
            
            Métodos30 smartTV = new Métodos30();
    
            System.out.println("TV Ligada?" + smartTV.ligada);
            System.out.println("Canal Atual:" + smartTV.canal);
            System.out.println("Volume Atual" + smartTV.volume);
    
            smartTV.ligar ();
            
            System.out.println("Novo Status -> TV Ligada?" + smartTV.ligada);
        }
    }
    
