package ex01_02_03;

/**
 *
 * @author Jv Loreti
 */

public class Main_Ex01{
    public static void main(String[] args){
        Telefone t1 = new Telefone("+55", "16", "78684527"); //Telefone 1
        Telefone t2 = new Telefone("16", "81423085"); //Telefone 2
        Telefone t3 = new Telefone("91777479"); //Telefone 3
        
        System.out.println(t1.printTelefone() + "\n" + t2.printTelefone() + "\n" + t3.printTelefone());
    }
}
