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
public class Pubblico extends Edificio{
    private int nGriglie;
    private int nStanze;
    private boolean normativaAntincendio;

    public Pubblico(int nGriglie, int nStanze, boolean normativaAntincendio, Impianto caldaia, int nTermosifoni, String nome) {
        super(caldaia, nTermosifoni, nome);
        this.nGriglie = nGriglie;
        this.nStanze = nStanze;
        this.normativaAntincendio = normativaAntincendio;
    }
    

    public int getnGriglie() {
        return nGriglie;
    }

    public void setnGriglie(int nGriglie) {
        this.nGriglie = nGriglie;
    }

    public int getnStanze() {
        return nStanze;
    }

    public void setnStanze(int nStanze) {
        this.nStanze = nStanze;
    }

    public boolean isNormativaAntincendio() {
        return normativaAntincendio;
    }

    public void setNormativaAntincendio(boolean normativaAntincendio) {
        this.normativaAntincendio = normativaAntincendio;
    }

    @Override
    public String toString() {
        return "Pubblico{" + "nGriglie=" + nGriglie + ", nStanze=" + nStanze + ", normativaAntincendio=" + normativaAntincendio + '}';
    }
    
    
}
