/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermercato;


public class Prodotto {

    private double prezzo;
    private double iva;
    private double peso;
    private double tara;
    private String descrizione;
    private String codiceBarre;

    public Prodotto(double prezzo, double iva, double peso, double tara, String descrizione, String codiceBarre) {
        this.prezzo = prezzo;
        this.iva = iva;
        this.peso = peso;
        this.tara = tara;
        this.descrizione = descrizione;
        this.codiceBarre = codiceBarre;
    }

    public double getTara() {
        return tara;
    }
    
    

    public double getPrezzo() {
        return prezzo;
    }

    public double getPeso() {
        return peso;
    }
    
    

    public double getIva() {
        return iva;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public String getCodiceBarre() {
        return codiceBarre;
    }

    public double prezzoIvato() {

        return prezzo + (prezzo / 100 * iva);
    }

    public double pesoLordo() {

        return peso + tara;
    }

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
    String testo="descrizione prodotto: "+descrizione+"\n"+"prezzo: "+prezzo+"\n"
            +"peso prodotto:"+peso+"\n"+"tara: "+tara+"\n"+"iva: "+iva+"\n"+
            "codice a barre: "+codiceBarre;
    
    
    return testo;}
    
    
}
