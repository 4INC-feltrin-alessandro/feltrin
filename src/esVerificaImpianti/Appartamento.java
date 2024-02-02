/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esVerificaImpianti;

/**
 *
 * @author alessandro.feltrin
 */
public class Appartamento {
    private int nStanze,nPersone;
    private double contabilitaEnergetica;

    public Appartamento(int nStanze, int nPersone, double contabilitaEnergetica) {
        this.nStanze = nStanze;
        this.nPersone = nPersone;
        this.contabilitaEnergetica = contabilitaEnergetica;
    }

    public int getnStanze() {
        return nStanze;
    }

    public void setnStanze(int nStanze) {
        this.nStanze = nStanze;
    }

    public int getnPersone() {
        return nPersone;
    }

    public void setnPersone(int nPersone) {
        this.nPersone = nPersone;
    }

    public double getContabilitaEnergetica() {
        return contabilitaEnergetica;
    }

    public void setContabilitaEnergetica(double contabilitaEnergetica) {
        this.contabilitaEnergetica = contabilitaEnergetica;
    }

    @Override
    public String toString() {
        return "Appartamento{" + "nStanze=" + nStanze + ", nPersone=" + nPersone + ", contabilitaEnergetica=" + contabilitaEnergetica + '}';
    }
    
    
}
