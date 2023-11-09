/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
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
        Orologio or=new Orologio(8, 5, 9);
        OrologioDigitale ord= new OrologioDigitale(19, 0, 0);
        OrologioCucu oc=new OrologioCucu(13, 0, 0);
       
        System.out.println("\n"+or.toString());
        System.out.println(or.dammiOrario());
        
        
        System.out.println("\n"+ord.toString());
        System.out.println(ord.dammiOrario(12));
        
        
        System.out.println("\n"+oc.toString());
        System.out.println(oc.cucu());
        
    }
    
}
