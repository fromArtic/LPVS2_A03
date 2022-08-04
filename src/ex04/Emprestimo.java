package ex04;

/**
 *
 * @author Jv Loreti
 */

public class Emprestimo{
    private Livro livros[];
    private Usuario usuarios[];
    private String num;
    private String data;
    private int quantExemplares;
    
    //Número máximo de livros e usuários registrados
    public Emprestimo(){
        this.livros = new Livro[1000];
        this.usuarios = new Usuario[1000];
    }
    
    //Registra um livro ao vetor
    public boolean addLivro(Livro b){
        for(int i = 0; i < 1000; i++){
            if(this.livros[i] == null){
                this.livros[i] = b;
                return true;
            }
        }
        return false;
    }
    
    //Registra um usuário ao vetor
    public boolean addUsuario(Usuario u){
        for(int i = 0; i < 1000; i++){
            if(this.usuarios[i] == null){
                this.usuarios[i] = u;
                return true;
            }
        }
        return false;
    }
    
    //Empréstimo
    public boolean emprestarLivro(String titulo, String nome, String n, String d, int qt){
        for(int i = 0; i < 1000; i++){
            if(this.livros[i].getTitulo() == titulo){
                if(this.livros[i].quantEstoque >= qt){
                    if(this.livros[i].getEmprestavel() == true){
                        for(int j = 0; j < 1000; j++){
                            if(this.usuarios[j].getNome() == nome){
                                this.usuarios[j].quantEmprestada += qt;
                                if(this.usuarios[j].quantEmprestada < 3){
                                    this.num = n;
                                    this.data = d;
                                    this.livros[i].quantEstoque -= qt;
                                    System.out.println("Empréstimo de livro efetuado com sucesso.");
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
}
