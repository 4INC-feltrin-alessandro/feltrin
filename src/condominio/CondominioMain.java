/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condominio;

/**
 *
 * @author alessandro.feltrin
 */
public class CondominioMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Appartamento ap=new Appartamento(0, "gino", 100);
        Appartamento ap1=new Appartamento(0, "pino", 150);
        Appartamento ap2=new Appartamento(0, "vino", 125);
        
  
        Appartamento[] appa={ap,ap1,ap2};
        Condominio con=new Condominio("mac1", "vi degasperi", appa);
        System.out.println(con.toString());
        System.out.println(con.appartamentoMaxMill());
    }
    
}
