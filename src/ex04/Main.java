package ex04;

/**
 *
 * @author Jv Loreti
 */

public class Main{
    public static void main(String[] args){
        Livro b1 = new Livro("Moby duck", true);
        b1.quantEstoque = 4;
        Livro b2 = new Livro("Viy", false);
        b2.quantEstoque = 1;
        Livro b3 = new Livro("História Química de uma Vela", true);
        b3.quantEstoque = 2;
        
        Usuario u1 = new Usuario("Tommy");
        Usuario u2 = new Usuario("Bono");
        
        Emprestimo emprestimo = new Emprestimo();
        emprestimo.addLivro(b1);
        emprestimo.addLivro(b2);
        emprestimo.addLivro(b3);
        emprestimo.addUsuario(u1);
        emprestimo.addUsuario(u2);
        
        emprestimo.emprestarLivro("Moby duck", "Tommy", "123", "22/09", 2);
        emprestimo.emprestarLivro("História Química de uma Vela", "Bono", "234", "22/09", 2);
    }
}
