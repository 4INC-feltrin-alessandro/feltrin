/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package supermercato;

/**
 *
 * @author alessandro
 */
public class SupermercatoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] descrizione={"bambole","videogiochi","verdura"};
        String[] codiceBarre={"9781234567890","9783567890123","9789012345678"};
        
        String[] indirizzo={"Via degasperi","Via brenzetti","Via muredei"};
        String[] nome={"poli","coop","conad"};
        String[] nomeProdotti={"bambole","videogiochi","verdura"};
        double[] prezzo={1.0,2.0,3.0};
        double[] iva={22,22,22};
        double[] peso={2.2,2.0,2.1};
        double[] tara={1.0,2.0,3.0};

        
        
        Supermercato sp=new Supermercato(indirizzo[0], nome[0], prezzo, iva, peso, tara, descrizione, codiceBarre);
        System.out.println(sp.stampa());
        System.out.println(sp.add(4.0, 22, 2.2, 4.0, "mele", "805141108037"));
        System.out.println(sp.stampa());
        

    }
    
}
