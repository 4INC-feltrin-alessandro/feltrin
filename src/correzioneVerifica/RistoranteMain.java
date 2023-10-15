/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package correzioneVerifica;

/**
 *
 * @author alessandro
 */
public class RistoranteMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Tavolo tv=new Tavolo(1, 3, 0, true);
        Tavolo[] tavoli=new Tavolo[8];
        int capienzaTav=8;
        /*System.out.println(tv.toString());
        tv.siedi();
        tv.siedi();
         System.out.println(tv.toString());
         */
        Ristorante rs=new Ristorante(tavoli, capienzaTav, 0);
        rs.add(tv);
        rs.add(tv);
        System.out.println(rs.toString());
    }
    
}
