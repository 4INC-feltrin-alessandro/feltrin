/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condominio;

public class Condominio {

    private String nome;
    private String indirizzo;
    private Appartamento[] appartamenti;

    public Condominio(String nome, String indirizzo, Appartamento[] appa) {
        this.nome = nome;
        this.indirizzo = indirizzo;

        this.appartamenti = new Appartamento[appa.length];
        for (int i = 0; i < appartamenti.length; i++) {
            this.appartamenti[i] = new Appartamento(appa[i]);
        }
    }

    public Condominio(Condominio condo) {
        this.nome=condo.nome;
        this.indirizzo=condo.indirizzo;
        this.appartamenti=condo.appartamenti;
    }
    
    public String toString(){
    String testo="";
    
        for (int i = 0; i < appartamenti.length; i++) {
            testo+=appartamenti[i].toString();
        }
    return testo;}
    
    
    public String appartamentoMaxMill(){
    
    int iMax=0;
        for (int i = 1; i < appartamenti.length; i++) {
            if (appartamenti[iMax].getMillesimi()<appartamenti[i].getMillesimi()){
            iMax=i;}
        }
    
    return appartamenti[iMax].getProprietario();}
            
    
    
}
