
package esVerificaImpianti;

/**
 *
 * @author alessandro.feltrin
 */
public abstract class  Edificio {
    private Impianto caldaia;
    private int nTermosifoni;
    private String nome;

    public Edificio(Impianto caldaia, int nTermosifoni, String nome) {
        this.caldaia = caldaia;
        this.nTermosifoni = nTermosifoni;
        this.nome = nome;
    }
    
    public String controlloAnnuale(){
        
        
    return "";
    }
    
    public String controlloFumi(){
        
        
    return "";
    }
    
    
}
