/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provaPoliformismo;

/**
 *
 * @author alessandro.feltrin
 */
public class Figlio extends Padre{
    private String ff;

    public Figlio(int pp) {
        super(pp);
        this.ff = "figlio";
    }

    public String getFf() {
        return ff;
    }

    public void setFf(String ff) {
        this.ff = ff;
    }

    @Override
    public void incrementa() {
        super.incrementa();
        ff="ho modificato il metodo del padre";

        
    }
    
   
    
    @Override
    public String toString() {
        return super.toString()+"Figlio{" + "ff=" + ff + '}';
    }
    
    
    
    
}
