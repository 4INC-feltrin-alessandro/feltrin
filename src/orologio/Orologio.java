/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orologio;

/**
 *
 * @author alessandro
 */
public class Orologio {

    private int ora, minuti, secondi;

    public Orologio(int ora, int minuti, int secondi) {
        this.ora = ora;
        this.minuti = minuti;
        this.secondi = secondi;
    }

    public int getMinuti() {
        return minuti;
    }

    public int getOra() {
        return ora;
    }

    public int getSecondi() {
        return secondi;
    }

    public String addzero(int orario) {
        String testo = "";
        if (orario < 10) {
            testo += "0" + orario + ":";
        } else {
            testo += orario + ":";
        }
        return testo;
    }
    
    public void aggiungiOre(int ore){
        if (ora+ore<24){
        this.ora= this.ora+ore;
        }
    }
    
     public void aggiungiOreOgg(Orologio ore){
        this.ora= this.ora+ore.ora;
        this.minuti= this.minuti+ore.minuti;
        this.secondi= this.secondi+ore.secondi;
    
    }

    public String dammiOrario() {
        
        
        
        return "orario: " + addzero(ora) + addzero(minuti) + addzero(secondi);
    }
    
    public String toString(){
    
    
    return "ora: "+ora+"\nminuti: "+minuti+"\nsecondi: "+secondi;}
    
}
