package verifica;
public class Ristorante {
    
    private int capienzaSale;
    private int totSale;
    private Sala[] sale;

    public Ristorante(int capienzaSale, int totSale, Sala[] sale) {
        this.capienzaSale = capienzaSale;
        this.totSale = totSale;
        this.sale = sale;
    }
   
      
    /*
    private int cercaSala(int numSala){
        int indice = 0;
        while(indice < totSale && sale[indice]. != numSala)
            indice++;
        return indice;
    }*/
    
    
    public boolean siediti(int numTav){
        return sala[cercaTav(numTav)].siediti();
    }
    
    public boolean alzati(int numTav){
        return tavoli[cercaTav(numTav)].alzati();
    }
     
    public int totPosti(){
        int ris = 0;
        for(int i = 0; i < totTav; i++)
            ris += tavoli[i].getCapienza();
        return ris;
    }
    
    public int totPersoneSedute(){
        int ris = 0;
        for(int i = 0; i < totTav; i++)
            ris += tavoli[i].getNumPers();
        return ris;
    }
    
    public boolean prenota(int persone){
        boolean ris = false;
        int indice = 0;
        while(indice < totTav && !tavoli[indice].prenota(persone))
            indice++;
        if(indice < totTav)
            ris = true;
        return ris;
    }
    
    public boolean disdici(int numTav){
        return tavoli[cercaTav(numTav)].disdici();
    }
    
    public boolean addTav(Tavolo t){
        boolean ris = false;
        if(totTav<capienzaTav){
            tavoli[totTav] = new Tavolo(t);
            totTav++;
            ris = true;
        }
        return ris;
    }
    
    private void shiftSx(int indice){
        for(int i = indice; i < totTav; i++)
            tavoli[i - 1] = tavoli[i];
    }
    
    public void remTav(int numTav){
        shiftSx(cercaTav(numTav));
    }
}

