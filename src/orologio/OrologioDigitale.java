/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orologio;

/**
 *
 * @author alessandro
 */
public class OrologioDigitale extends Orologio {

    public OrologioDigitale(int ora, int minuti, int secondi) {
        super(ora, minuti, secondi);
    }

    @Override
    public String addzero(int orario) {
        return super.addzero(orario); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    public String dammiOrario(int tipo) {
        int copiaOra = getOra();
        String testo = "";
        String parteGiornata = " ";
        if (tipo == 12 || tipo == 24) {
            if (tipo == 12) {
                if (getOra() > 12) {
                    copiaOra = copiaOra - 12;
                    parteGiornata = "pm";
                } else {
                    parteGiornata = "am";
                }

            }

            testo = "orario: " + addzero(copiaOra) + addzero(getMinuti()) + addzero(getSecondi()) + parteGiornata;
        } else {
            testo = "errore";
        }

        return testo;
    }

    @Override
    public String toString() {
        return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
     

}
