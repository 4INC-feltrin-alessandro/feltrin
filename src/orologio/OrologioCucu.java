/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orologio;

/**
 *
 * @author alessandro
 */
public class OrologioCucu extends Orologio{

    public OrologioCucu(int ora, int minuti, int secondi) {
        super(ora, minuti, secondi);
    }
    
    public boolean cucu(){
    boolean cuculo =false;
    if(getOra()==12 &&getMinuti()==0&&getSecondi()==0){
    cuculo=true;
    }
    return cuculo;}

    @Override
    public String toString() {
        return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void aggiungiOre(int ore) {
        super.aggiungiOre(ore); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void aggiungiOreOgg(Orologio ore) {
        super.aggiungiOreOgg(ore); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
