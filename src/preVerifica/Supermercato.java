
package preVerifica;
public class Supermercato {
    private String nome;
    private String indirizzo;
    private Prodotto[] prodotti;
    private int dimL;
    
    public Supermercato(int nMerce,String nome,String indirizzo,double[] prezzo,double[] iva,double[] peso,double[] tara,String[] desc,String[] codBarre){
        this.nome=nome;
        this.indirizzo=indirizzo;
        prodotti=new Prodotto[nMerce];
        for(int i=0;i<prodotti.length;i++){
            addProdotto(prezzo[i],iva[i],peso[i],tara[i],desc[i],codBarre[i]);
        }
    }
    
    public void addProdotto(double prezzo, double iva, double peso, double tara, String desc, String codBarre){
        if(dimL==prodotti.length){
            resize();
        }else{
            prodotti[prodotti.length-1]=new Prodotto(prezzo,iva,peso,tara,desc,codBarre);
            dimL++; 
        }
    }
    
    public void resize(){
        Prodotto[] prodottiCopia=new Prodotto[prodotti.length+(int)(prodotti.length*0.20)];
        for(int i=0;i<prodotti.length;i++){
            prodottiCopia[i]=prodotti[i];
        }
        prodotti=prodottiCopia;
    }

    public String getNome() {
        return nome;
    }

    public String getIndirizzo() {
        return indirizzo;
    }
    
    public String prezzoAlto(){
        int c=0;
        for(int i=0;i<prodotti.length;i++){
            if(prodotti[i].prezzoIvato()>prodotti[c].prezzoIvato()){
                c=i;
            }
        }
        return prodotti[c].getDescrizione()+" ha il prezzo ivato piu' alto: "+prodotti[c].prezzoIvato();
    }
    
    public double valoreMerce(){
        double s=0;
        for(int i=0;i<prodotti.length;i++){
            s+=prodotti[i].prezzoIvato();
        }
        return s;
    }
    
    public double pesoMinore(){
        int c=0;
        for(int i=0;i<prodotti.length;i++){
            if(prodotti[i].pesoLordo()<prodotti[c].pesoLordo()){
                c=i;
            }
        }
        return prodotti[c].pesoLordo();
    }
    
    public String merciSopraMedia(){
        double s=0;
        double media;
        String t="Prodotti con prezzo superiore alla media:";
        for(int i=0;i<prodotti.length;i++){
            s+=prodotti[i].getPrezzo();
        }
        media=s/prodotti.length;
        for(int i=0;i<prodotti.length;i++){
            if(prodotti[i].getPrezzo()>media){
                t+="\n"+prodotti[i].getDescrizione()+": "+prodotti[i].getPrezzo();
            }
        }
        return t;
    }
    
    public String stampa(){
        String t="\nClasse Supermercato:";
        t+="\nNome: "+nome+"\nIndirizzo: "+indirizzo+"\nMerce: ";
        for(int i=0;i<prodotti.length;i++){
            t+="\n"+prodotti[i].stampa();
        }
        return t;
    }
}
