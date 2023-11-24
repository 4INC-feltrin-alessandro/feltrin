package prodotti;

public class ProdottiAlimentari extends Prodotti {
    
    private int dataScadenza;
    private int sconto;

    public ProdottiAlimentari(double prezzo, double iva, double peso, double tara, String descrizione, String codiceBarre) {
        super(prezzo, iva, peso, tara, descrizione, codiceBarre);
    
        this.dataScadenza = calcGiorni(dataScadenza);
        inizSconto(calcGiorni(dataAtuale));
    }

    private int calcGiorni(String data) {
        int risult = 0;
        String[] dataSplit = data.split("/");
        risult += calcGiorniAnno(Integer.valueOf(dataSplit[2]));
        risult += calcGiorniMese(Integer.valueOf(dataSplit[1]));
        risult += Integer.valueOf(dataSplit[0]);
        return risult;
    }

    private int calcGiorniAnno(int anno) {
        int risult = 365;
        if ((anno % 400 == 0) || ((anno % 4 == 0) && (anno % 100 != 0))) {
            risult--;
        }
        return risult * anno;
    }

    private int calcGiorniMese(int mese) {
        int risult = 0;
        for (int i = 0; i < mese; i++) {
            switch (i) {
                case 2:
                    risult += 28;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    risult += 30;
                    break;
                default:
                    risult+=31;
            }
        }
        return risult;
    }

    public void inizSconto(int dataAtuale){
        sconto = 0;
        if (dataScadenza - dataAtuale < 2) {
            sconto = 50;
        } else if (dataScadenza - dataAtuale < 10) {
            sconto = 30;
        }
        if (dataScadenza-dataAtuale < 0) {
            sconto=-1;
        }
    }

    public int getSconto() {
        return sconto;
    }

    public int getDataScadenza() {
        return dataScadenza;
    }

    @Override
    public String toString() {
        String risult="prodotto scaduto";
        if(sconto>=0){
            risult=super.toString()+" dataScadenza:"+dataScadenza+" sconto:"+sconto;
        }
        return risult;
    }
    
    

}
