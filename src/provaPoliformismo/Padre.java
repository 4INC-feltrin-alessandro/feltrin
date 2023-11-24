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
public class Padre {
    private int pp;


    public Padre(int pp) {
        this.pp = pp;
    }
    
    public int getPp() {
        return pp;
    }

    public void setPp(int pp) {
        this.pp = pp;
    }
    
    public void incrementa(){
    
    this.pp++;}

    @Override
    public String toString() {
        return "Padre{" + "pp=" + pp + '}';
    }
    
    

    
    
    
}
