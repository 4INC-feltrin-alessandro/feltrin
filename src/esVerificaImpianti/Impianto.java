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
public class Impianto {
   private int dimensione;
   private double potenza;
   private boolean acquaCalda;
   private String modello,marca;
   private Data dataControlloFumi,dataControlloAnnuale;

    public Impianto(int dimensione, double potenza, boolean acquaCalda, String modello, String marca, Data dataControlloFumi, Data dataControlloAnnuale) {
        this.dimensione = dimensione;
        this.potenza = potenza;
        this.acquaCalda = acquaCalda;
        this.modello = modello;
        this.marca = marca;
        this.dataControlloFumi = dataControlloFumi;
        this.dataControlloAnnuale = dataControlloAnnuale;
    }

    public int getDimensione() {
        return dimensione;
    }

    public void setDimensione(int dimensione) {
        this.dimensione = dimensione;
    }

    public double getPotenza() {
        return potenza;
    }

    public void setPotenza(double potenza) {
        this.potenza = potenza;
    }

    public boolean isAcquaCalda() {
        return acquaCalda;
    }

    public void setAcquaCalda(boolean acquaCalda) {
        this.acquaCalda = acquaCalda;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Data getDataControlloFumi() {
        return dataControlloFumi;
    }

    public void setDataControlloFumi(Data dataControlloFumi) {
        this.dataControlloFumi = dataControlloFumi;
    }

    public Data getDataControlloAnnuale() {
        return dataControlloAnnuale;
    }

    public void setDataControlloAnnuale(Data dataControlloAnnuale) {
        this.dataControlloAnnuale = dataControlloAnnuale;
    }

    @Override
    public String toString() {
        return "Impianto{" + "dimensione=" + dimensione + ", potenza=" + potenza + ", acquaCalda=" + acquaCalda + ", modello=" + modello + ", marca=" + marca + ", dataControlloFumi=" + dataControlloFumi + ", dataControlloAnnuale=" + dataControlloAnnuale + '}';
    }
   
   
   
}
