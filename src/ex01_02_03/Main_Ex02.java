package ex01_02_03;

/**
 *
 * @author Jv Loreti
 */

public class Main_Ex02{
    public static void main(String[] args){
        Contato c1 = new Contato("Tommy", "Artic", "97017712"); //Contato 1
        Contato c2 = new Contato("Franz", "Kapka", "16", "33613040"); //Contato 2
        Contato c3 = new Contato("Nikolai", "Google", "+55", "16", "9701"); //Contato 3
        Telefone tel = new Telefone("+55", "16", "28061914"); //Telefone do contato 4
        Contato c4 = new Contato("Franz", "Ferdinand", tel); //Contato 4
        
        System.out.println(c1.printContato() + "\n" + c2.printContato() + "\n" + c3.printContato() + "\n" + c4.printContato());
    }
}
