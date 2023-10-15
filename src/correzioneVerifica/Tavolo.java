/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package correzioneVerifica;

/**
 *
 * @author alessandro
 */
public class Tavolo {
    private int numeroTav;
    private int capienza;
    private int personeSedute;
    private boolean prenotazione;

    public Tavolo(int numeroTav, int capienza, int personeSedute, boolean prenotazione) {
        this.numeroTav = numeroTav;
        this.capienza = capienza;
        this.personeSedute = personeSedute;
        this.prenotazione = prenotazione;
    }

    public void setCapienza(int capienza) {
        this.capienza = capienza;
    }

    public void setNumeroTav(int numeroTav) {
        this.numeroTav = numeroTav;
    }

    public void setPersoneSedute(int personeSedute) {
        this.personeSedute = personeSedute;
    }

    public void setPrenotazione(boolean prenotazione) {
        this.prenotazione = prenotazione;
    }

    public int getCapienza() {
        return capienza;
    }

    public int getPersoneSedute() {
        return personeSedute;
    }

    public int getNumeroTav() {
        return numeroTav;
    }

    public boolean getPrenotazione() {
        return prenotazione;
    }
    
    public void siedi(){
    
    personeSedute++;
    }
    
    public String toString(){
    String testo="\nnumero tavolo: "+numeroTav+"\ncapienza tavolo: "+capienza+
            "\npersone sedute: "+personeSedute+"\nprenotazione: "+prenotazione;
    
    
    return testo;}
    
    

    
    
}
