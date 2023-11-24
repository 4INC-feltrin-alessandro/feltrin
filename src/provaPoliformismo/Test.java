/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provaPoliformismo;

/**
 *
 * @author alessandro.feltrin
 * gay
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*int pp=2;
        String ff="sc";
        Padre p=new Padre(pp);
        Figlio f=new Figlio(pp);
        
        System.out.println(p.toString());
        p.incrementa();
        System.out.println(p.toString());
        f.incrementa();
        System.out.println(f.toString());*/
        
        Padre p= new Padre(0);
        Figlio f=new Figlio(0);
        Padre pf = new Figlio(0);
        Padre pp= pf;
        
        pp.incrementa();
        System.out.println("p "+p.toString());
        System.out.println("pp "+pp.toString());
        
        f.incrementa();
        System.out.println("f"+f.toString());
        
        pf.incrementa();
        System.out.println("pf"+pf.toString());

        Figlio ff=(Figlio)pp;
        System.out.println("ff"+ff.toString());
        
    
        
        Figlio fu=(Figlio)pf;
        System.out.println("ff"+ff.toString());
        
    }
    
}
