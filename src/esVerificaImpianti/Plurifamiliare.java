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
public class Plurifamiliare extends Edificio {
    private int nAppartamenti;
    private String nome;
    private Appartamento appartamento;
    private boolean normativaAntincendio;

    public Plurifamiliare(int nAppartamenti, Appartamento appartamento, boolean normativaAntincendio, Impianto caldaia, int nTermosifoni, String nome) {
        super(caldaia, nTermosifoni, nome);
        this.nAppartamenti = nAppartamenti;
        
        
        this.nome = nome;
        this.appartamento.getContabilitaEnergetica() = appartamento.getContabilitaEnergetica();
        
        this.normativaAntincendio = normativaAntincendio;
    }

    public int getnAppartamenti() {
        return nAppartamenti;
    }

    public void setnAppartamenti(int nAppartamenti) {
        this.nAppartamenti = nAppartamenti;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Appartamento getAppartamento() {
        return appartamento;
    }

    public void setAppartamento(Appartamento appartamento) {
        this.appartamento = appartamento;
    }

    public boolean isNormativaAntincendio() {
        return normativaAntincendio;
    }

    public void setNormativaAntincendio(boolean normativaAntincendio) {
        this.normativaAntincendio = normativaAntincendio;
    }

    @Override
    public String toString() {
        return "Plurifamiliare{" + "nAppartamenti=" + nAppartamenti + ", nome=" + nome + ", appartamento=" + appartamento + ", normativaAntincendio=" + normativaAntincendio + '}';
    }
    
    
    
    
}
