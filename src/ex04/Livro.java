package ex04;

/**
 *
 * @author Jv Loreti
 */

public class Livro{
    private String titulo;
    public int quantEstoque;
    private boolean emprestavel;
    
    public Livro(String a, boolean b){
        this.titulo = a;
        this.emprestavel = b;
    }
    
    public String getTitulo(){
        return titulo;
    }
    public boolean getEmprestavel(){
        return emprestavel;
    }
}
