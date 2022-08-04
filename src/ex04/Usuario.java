package ex04;

/**
 *
 * @author Jv Loreti
 */

public class Usuario{
    private String nome;
    public int quantEmprestada;
    
    public Usuario(String n){
        this.nome = n;
        this.quantEmprestada = 0;
    }

    public String getNome(){
        return nome;
    }
}
