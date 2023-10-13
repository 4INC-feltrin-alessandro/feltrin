/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condominio;

/**
 *
 * @author alessandro.feltrin
 */
public class Appartamento {
    private int num;
    private String proprietario;
    private int millesimi;

    public Appartamento(int nume, String proprietario, int millesimi) {
        this.num = nume;
        this.proprietario = proprietario;
        this.millesimi = millesimi;
    }

    public Appartamento(Appartamento appartamento) {
        this.num=appartamento.num;
        this.proprietario=appartamento.proprietario;
        this.millesimi=appartamento.millesimi;
    }

    public int getNum() {
        return num;
    }

    public int getMillesimi() {
        return millesimi;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }


    public String toString(){
    
    
    return "\n\nnumero appartamento:"+num+"\nproprietario: "
            +proprietario+"\nmillesimi: "+millesimi;
    }
    
    
}
