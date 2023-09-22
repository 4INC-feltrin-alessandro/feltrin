/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermercato;

public class Supermercato {

    private String indirizzo;
    private String nome;
    private Prodotto[] prodotti;

    public Supermercato(String indirizzo, String nome, String[] prodotti,
            double[] prezzo, double[] iva, double[] peso, double[] tara,
            String[] descrizione, String[] codiceBarre) {
        this.indirizzo = indirizzo;
        this.nome = nome;

        caricaProdotti(prezzo, iva, peso, tara, descrizione, codiceBarre);

    }

    private void caricaProdotti(double[] prezzo, double[] iva,
            double[] peso, double[] tara, String[] descrizione, String[] codiceBarre) {
        this.prodotti = new Prodotto[prezzo.length];
        for (int i = 0; i < prezzo.length; i++) {
            this.prodotti[i] = new Prodotto(prezzo[i], iva[i], peso[i], tara[i], descrizione[i], codiceBarre[i]);
        }
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public String getNome() {
        return nome;
    }

    public String prezzAlto() {

        int iMax = 0;
        for (int i = 1; i < prodotti.length; i++) {
            if (prodotti[iMax].prezzoIvato() < prodotti[i].prezzoIvato()) {
                iMax = i;

            }

        }

        return "il prodotto con il prezzo più alto è "
                + prodotti[iMax].getDescrizione() + " e costa: " + prodotti[iMax].prezzoIvato();
    }

    public String valoreMerce() {
        String ris = "";
        double somma = 0;

        for (int i = 0; i < prodotti.length; i++) {
            somma = somma + prodotti[i].getPrezzo();

        }

        return "il valore totale della merce è: " + somma;
    }

    public String pesoMinore() {
        int iMin = 0;
        for (int i = 1; i < prodotti.length; i++) {
            if (prodotti[iMin].getPeso() > prodotti[i].getPeso()) {
                iMin = i;

            }
        }
        return "il prodotto con il peso minore è " + prodotti[iMin].getDescrizione()
                + " e pesa: " + prodotti[iMin].getPeso();
    }

    public String merciSopraMedia() {
        double media = 0;
        String testo = "";
        String ris = "maggiore";
        for (int i = 0; i < prodotti.length; i++) {
            media = media + prodotti[i].getPrezzo();
        }
        media = media / prodotti.length + 1;

        for (int i = 0; i < prodotti.length; i++) {
            if (prodotti[i].getPrezzo() < media) {
                ris = "minore";
            }

            testo += "prodotto: " + prodotti[i].getDescrizione() + "  ----  prezzo: " + ris + "\n";

        }

        return testo;
    }

    public String stampa() {
        String testo = "nome supermercato: " + nome + "  ----  indirizzo: " + indirizzo + "\n";

        for (int i = 0; i < prodotti.length; i++) {

            testo += "\n" + "descrizione prodotto: " + prodotti[i].getDescrizione()
                    + "\n" + "prezzo: " + prodotti[i].getPrezzo() + "\n"
                    + "peso prodotto:" + prodotti[i].getPeso() + "\n" + "tara: "
                    + prodotti[i].getTara() + "\n" + "iva: " + prodotti[i].getIva() + "\n"
                    + "codice a barre: " + prodotti[i].getCodiceBarre() + "\n";
        }

        return testo;
    }

}




