package ex01_02_03;

/**
 *
 * @author Jv Loreti
 */

public class Contato{
    private String nome;
    private String sobrenome;
    private Telefone telefone;
    
    /**
     * Constrói o objeto com base no nome, sobrenome e número do telefone
     * @param a
     * @param b
     * @param num 
     */
    public Contato(String a, String b, String num){
        this.nome = a;
        this.sobrenome = b;
        this.telefone = new Telefone(num);
    }
    
    /**
     * Constrói o objeto com base no nome, sobrenome, código de área e número do telefone
     * @param a
     * @param b
     * @param area
     * @param num 
     */
    public Contato(String a, String b, String area, String num){
        this.nome = a;
        this.sobrenome = b;
        this.telefone = new Telefone(area, num);
    }
    
    /**
     * Constrói o objeto com base no nome, sobrenome, código internacional e de área e número do telefone
     * @param a
     * @param b
     * @param inter
     * @param area
     * @param num 
     */
    public Contato(String a, String b, String inter, String area, String num){
        this.nome = a;
        this.sobrenome = b;
        this.telefone = new Telefone(inter, area, num);
    }
    
    /**
     * Constrói o objeto com base no nome e sobrenome, incluindo uma variável Telefone criada separadamente
     * @param a
     * @param b
     * @param t 
     */
    public Contato(String a, String b, Telefone t){
        this.nome = a;
        this.sobrenome = b;
        this.telefone = t;
    }
    
    //Saída (ex. 02)
    public String printContato(){
       return this.nome + " " + this.sobrenome + " " + this.getTelefone().printTelefone();
    }
    
    //Saída (ex. 03, agenda telefônica)
    public void printContatosAgenda(){
        System.out.println(this.nome + " " + this.sobrenome + " " + this.getTelefone().printTelefone());
    }
      
    //Retorna nome e telefone
    public String getNome(){
        return nome;
    }
    public Telefone getTelefone(){
        return telefone;
    }
}
