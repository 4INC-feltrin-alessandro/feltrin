package biblioteca;
public class Libro {
    private String codiceIsbn, casaEditrice, autore, anno;

    public Libro(String codiceIsbn, String casaEditrice, String autore, String anno) {
        this.codiceIsbn = codiceIsbn;
        this.casaEditrice = casaEditrice;
        this.autore = autore;
        this.anno = anno;
    }
    
    public Libro(Libro libro){
        this.codiceIsbn = libro.codiceIsbn;
        this.casaEditrice = libro.casaEditrice;
        this.autore = libro.autore;
        this.anno = libro.anno;
    }


    public String getCodiceIsbn() {
        return codiceIsbn;
    }

    public String getCasaEditrice() {
        return casaEditrice;
    }

    public String getAutore() {
        return autore;
    }

    public String getAnno() {
        return anno;
    }

    public String toString(){
    
    
    return "codice isbn: "+codiceIsbn+"\ncasa editrice: "
            +casaEditrice+"\nautore: "+autore+"\nanno: "+anno;}
    
   
    
    
}
