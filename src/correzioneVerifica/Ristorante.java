/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package correzioneVerifica;

/**
 *
 * @author alessandro
 */
public class Ristorante {
    private Tavolo[] tavoli;
    private int nTavoli;
    private int capienza;
    private int dimL;

    public Ristorante(Tavolo[] tavoli, int nTavoli, int capienza) {
        this.tavoli = tavoli;
        this.nTavoli = nTavoli;
        this.capienza = capienza;
        this.dimL=0;
    }
    
    
    public String toString(){
    String testo="";
        for (int i = 0; i < dimL; i++) {
            testo += "\n"+tavoli[i].toString();
        }
    
    return testo;}
    
    public void add(Tavolo t){
        tavoli[dimL]=t;
        dimL++;
    
    }
    
    public void remove(int nTavolo){
    dimL--;
    
    }
    
    
}
