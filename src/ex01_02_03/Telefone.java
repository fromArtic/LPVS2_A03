package ex01_02_03;

/**
 *
 * @author Jv Loreti
 */

public class Telefone{
    private String codigoInternacional;
    private String codigoArea;
    private String numeroTelefone;
    
    /**
     * Constrói o objeto com base em 3 parâmetros
     * @param a
     * @param b
     * @param c 
     */
    public Telefone(String a, String b, String c){
        this.codigoInternacional = a;
        this.codigoArea = b;
        this.numeroTelefone = c;
    }
    
    /**
     * Constrói o objeto com base em 2 parâmetros, com código internacional já estabelecido (+55)
     * @param b
     * @param c 
     */
     public Telefone(String b, String c){
        this.codigoInternacional = "+55";
        this.codigoArea = b;
        this.numeroTelefone = c;
     }
     
     /**
      * Constrói o objeto com base em apenas 1 parâmetro, com código internacional e de área já estabelecidos (+55 e 16)
      * @param c 
      */
      public Telefone(String c){
        this.codigoInternacional = "+55";
        this.codigoArea = "16";
        this.numeroTelefone = c;
      }
      
      //Saída
      public String printTelefone(){
          return this.codigoInternacional + " " + this.codigoArea + " " + this.numeroTelefone;
      }
}