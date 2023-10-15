/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package preVerifica;

//caratterizzata dal prezzo, iva, peso, tara, descrizione e codice a barre.
public class Prodotto {

    private double prezzo, iva, peso, tara;
    private String descrizione, codiceBarre;

    public Prodotto(double prezzo, double iva, double peso, double tara, String descrizione, String codiceBarre) {
        this.prezzo = prezzo;
        this.iva = iva;
        this.peso = peso;
        this.tara = tara;
        this.descrizione = descrizione;
        this.codiceBarre = codiceBarre;
    }

    public String getCodiceBarre() {
        return codiceBarre;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public double getIva() {
        return iva;
    }

    public double getPeso() {
        return peso;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public double getTara() {
        return tara;
    }

    public void setCodiceBarre(String codiceBarre) {
        this.codiceBarre = codiceBarre;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public void setTara(double tara) {
        this.tara = tara;
    }

    public double prezzoIvato() {

        return prezzo + (prezzo / 100 * iva);
    }
    
    public double pesoLordo(){
    
    return peso+tara;}
    
    public double controlloCodice() {
        int i = 1;
        double tot = 0;
        double a;
        while (i < 12) {
            a = codiceBarre.charAt(i);
            if (i % 2 != 0) {
                a = a * 3;
            }
            tot = tot + a;
            i++;
        }

        return tot % 10;
    }
    
    
    public String stampa(){

    return "prezzo: "+prezzo+"\niva: "+"\npeso: "+peso+"\ntara: "+tara+"\ndescrizione: "+descrizione+"\ncodice a barre: "+codiceBarre;}

}
