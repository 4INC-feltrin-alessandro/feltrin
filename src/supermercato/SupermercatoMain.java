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
       
        
        Prodotto bistecca = new Prodotto(10, 22, 0.4, 0.05,"9781234567890", "Bistecca ");
        Prodotto olio = new Prodotto(10, 22, 0.4, 0.05,"9781234567890", "olio");
        Prodotto sale = new Prodotto(10, 22, 0.4, 0.05,"9781234567890", "sale");
      
        Prodotto[] prodottiInVendita = {bistecca, olio, sale};

        Supermercato sp=new Supermercato("coop", "via degasperi", prodottiInVendita);
        sp.addProdotto(0.0, 0.0, 0.0, 0.0, "bambole", "9781234567890");
        System.out.println(sp.toString());
        

    }
    
}
