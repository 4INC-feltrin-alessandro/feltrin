/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newPecaOggetti;

/**
 *
 * @author alessandro.feltrin sas
 */
public abstract class Oggetto {

    private final int punteggio;

    public Oggetto(int punteggio) {
        this.punteggio = punteggio;
    }

    public int getPunteggio() {
        return punteggio;
    }

    public abstract void setPunteggio(int punteggio);

    @Override
    public String toString() {
        return "Oggetto{" + "punteggio=" + punteggio + '}';
    }

}
