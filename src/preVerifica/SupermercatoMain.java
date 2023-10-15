/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package preVerifica;

/**
 *
 * @author alessandro
 */
public class SupermercatoMain {

   
    public static void main(String[] args) {
      
             String nome="Eurospin";
        String indirizzo="Via Soprasasso 20";
        double[] prezzo={0.40,0.89,3.20};
        double[] iva={1.04,1.02,2.01};
        double[] peso={500,300,150};
        double[] tara={0.02,0.01,0.05};
        String[] desc={"Acqua frizzante","Patatine","Deodorante"};
        String[] codBarre={"801796057020","8003130127922","8004120902758"};
        
        Supermercato s=new Supermercato(3, nome, indirizzo, prezzo, iva, peso, tara, desc, codBarre);
        /*System.out.println(s.prezzoAlto());
        System.out.println(s.valoreMerce());
        System.out.println(s.pesoMinore());
        System.out.println(s.merciSopraMedia());*/
        System.out.println(s.stampa());
    
    
    }}