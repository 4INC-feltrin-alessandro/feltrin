
package biblioteca;

public class Biblioteca {
    private Libro[] libri;
    private int dimL;

    public Biblioteca(Libro[] lib){
        this.libri = new Libro[lib.length];
        for(int i=0 ; i<libri.length ; i++){
            this.libri[i] = new Libro(lib[i]);
        dimL++;}
    }
    
     public int ricercaLibroAutore(String autore){
        int indice = 0;
        while(indice < dimL && !libri[indice].getAutore().equals(autore) ){
            indice ++;
        }
        return indice;
    }    
     public int ricercaLibroISBN(String Isbn){
        int indice = 0;
        while(indice < dimL && !libri[indice].getCodiceIsbn().equals(Isbn) ){
            indice ++;
        }
        return indice;
    }    
     
      public int ricercaLibroCasaEditrice(String casaEditrice){
        int indice = 0;
        while(indice < dimL && !libri[indice].getCasaEditrice().equals(casaEditrice) ){
            indice ++;
        }
        return indice;
    }    

     
    public String toString(){
    String testo="";
        for (int i = 0; i < libri.length; i++) {
            testo+="\n"+libri[i].toString();
        }
    
    return testo;}

    
   
}

