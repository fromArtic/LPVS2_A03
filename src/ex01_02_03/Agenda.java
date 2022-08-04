package ex01_02_03;

/**
 *
 * @author Jv Loreti
 */

public class Agenda{
    Contato contatos[];
    
    //Número máximo de contatos
    public Agenda(){
        this.contatos = new Contato[5];
    }
    
    //Adicionar um novo contato
    public boolean addContato(Contato c){
        for(int i = 0; i < 5; i++){
            if(this.contatos[i] == null){
                this.contatos[i] = c;
                return true;
            }
        }
        return false;
    }
    
    //Remover um contato pelo nome
    public boolean removeContato(String nome){
        for(int i = 0; i < 5; i++){
            if(this.contatos[i].getNome() == nome){
                this.contatos[i] = null;
                return true;
            }
        }
        return false;
    }
    
    //Buscar um contato pelo nome
    public Contato searchContato(String nome){
        for(int i = 0; i < 5; i++){
            if(this.contatos[i].getNome() == nome){
                return this.contatos[i];
            }
        }
        return null;
    }
    
    //Imprimir todos os contatos cadastrados
    public void printAgenda(){
        for(int i = 0; i < 5; i++){
            if(this.contatos[i] != null){
               this.contatos[i].printContatosAgenda();
            }
        }
    }
}
