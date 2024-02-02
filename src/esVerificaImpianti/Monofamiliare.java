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
public class Monofamiliare extends Edificio{
    private int nStanze;
    private int nResidenti;

    public Monofamiliare(Impianto caldaia, int nTermosifoni, String nome) {
        super(caldaia, nTermosifoni, nome);
    }

    public int getnStanze() {
        return nStanze;
    }

    public void setnStanze(int nStanze) {
        this.nStanze = nStanze;
    }

    public int getnResidenti() {
        return nResidenti;
    }

    public void setnResidenti(int nResidenti) {
        this.nResidenti = nResidenti;
    }
    
    
}
