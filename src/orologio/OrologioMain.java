package orologio;

/**
 *
 * @author alessandro
 */
public class OrologioMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Orologio or1=new Orologio(10, 5, 9);
        Orologio or2=new Orologio(6, 55, 10);
        Orologio or3=new Orologio(19, 40, 35);
        
        Orologio ora=new Orologio(2, 2, 10);

                
        OrologioDigitale ord= new OrologioDigitale(19, 0, 0);
        OrologioCucu oc=new OrologioCucu(13, 0, 0);
        
        
        
        Orologio[] orologi={or1,or2,or3};
       
        //System.out.println("\n"+or1.toString());
        //System.out.println(or.dammiOrario());
        System.out.println("prima:\n"+orologi[0].dammiOrario());
        System.out.println(orologi[1].dammiOrario());
        System.out.println(orologi[2].dammiOrario());
        
        //or.aggiungiOre(3);
        orologi[0].aggiungiOreOgg(ora);
        orologi[1].aggiungiOreOgg(ora);
        orologi[2].aggiungiOreOgg(ora);
        
        System.out.println("tempo aggiunto: \n"+ora.toString());
        
        System.out.println("\ndopo:\n"+orologi[0].dammiOrario());
        System.out.println(orologi[1].dammiOrario());
        System.out.println(orologi[2].dammiOrario());
    }
    
}


