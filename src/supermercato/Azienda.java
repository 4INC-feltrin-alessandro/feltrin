/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermercato;

/**
 *
 * @author alessandro.feltrin
 */
public class Azienda {

    private String nomeGruppo;
    private String sedeLegale;
    private Supermercato[] supermercati;

    public Azienda(String nomeGruppo, String sedeLegale, Supermercato[] supermercati) {
        this.nomeGruppo = nomeGruppo;
        this.sedeLegale = sedeLegale;
        this.supermercati = copia(supermercati);
    }

    private Supermercato[] copia(Supermercato[] arraydaCopiare) {
        Supermercato[] temp = new Supermercato[arraydaCopiare.length];
        for (int i = 0; i < arraydaCopiare.length; i++) {
            temp[i] = arraydaCopiare[i];
        }

        return temp;
    }
    
    public void addProd(Prodotto[] pAdd,int indice){
        supermercati[indice].addProd(pAdd);
    }

}
