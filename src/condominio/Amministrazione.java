  
package condominio;

public class Amministrazione {
    private Condominio[] condomini;
    private int nCond;
   

    public Amministrazione(int nCond) {
        
        condomini=new Condominio[nCond];
        this.nCond = 0;
     
    }
    
    
    public void addCondomini(Condominio condo){
    Condominio[] copia = new Condominio[condomini.length+5];
        for(int i=0 ; i<nCond ; i++)
            copia[i] = condomini[i];
        condomini = copia;
        nCond++;

    }
    
    public String nMaxApp(){
        
    int iMax=0;
        for (int i = 0; i <condomini.length; i++) {
            if(condomini[iMax].nAppartamenti()<condomini[i].nAppartamenti()){
                iMax=i;
            }
        }
    String testo="condominio con più appartamenti: "+condomini[iMax].getNome();
    
    return testo;}
    
    
    public String nomeMaxMillCond(){
    String testo="";
    
        for (int i = 0; i < condomini.length; i++) {
            testo+= "condominio "+condomini[i].getNome()+":"+condomini[i].appartamentoMaxMill()+"\n";
        }
    
    return testo;}
    
   @Override
    public String toString() {
        String risult = "numCond:"+nCond+"\n";
        for(int i=0 ; i<nCond ; i++)
            risult+="-----Condomini["+i+"]------"+condomini[i].toString()+"\n\n";
        return risult;
    }
}


    
    

