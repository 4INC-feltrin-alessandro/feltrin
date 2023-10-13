package biblioteca;

public class BibliotecaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Libro lb=new Libro("111122223333", "myPearson", "billy", "2008");
        Libro lb1=new Libro("221122223333", "a", "bobby", "2008");
        Libro lb2=new Libro("331122223333", "bombacla", "bubby", "2008");
        Libro[] libri={lb,lb1,lb2};
        Biblioteca bi=new Biblioteca(libri);
        //System.out.println(lb.toString());
        //System.out.println(bi.toString());
        System.out.println(bi.ricercaLibroAutore("billy"));
        
        System.out.println(bi.ricercaLibroISBN("221122223333"));
        System.out.println(bi.ricercaLibroCasaEditrice("bombacla"));
    }
    
}

