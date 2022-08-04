package ex01_02_03;

/**
 *
 * @author Jv Loreti
 */

public class Main_Ex03{
    public static void main(String[] args){
        Contato c1 = new Contato("Tommy", "Artic", "+55", "16", "97017712"); //Contato 1
        Contato c2 = new Contato("Frans", "Kapka", "+55", "16", "33613040"); //Contato 2
        Contato c3 = new Contato("Nikolai", "Google", "+55", "16", "9701"); //Contato 3
        Contato c4 = new Contato("Franz", "Ferdinand", "+55", "16", "9701"); //Contato 4
        Contato c5 = new Contato("Murakami", "Haruki", "+55", "16", "21771079"); //Contato 5
        
        Agenda agenda = new Agenda();
        agenda.addContato(c1);
        agenda.addContato(c2);
        agenda.addContato(c3);
        agenda.addContato(c4);
        agenda.addContato(c5);
        
        agenda.printAgenda(); //Imprime a agenda
        agenda.removeContato("Nikolai"); //Remove um contato
        System.out.println("\n-- contato excluído --\n");
        agenda.printAgenda(); //Imprime a agenda novamente
        agenda.searchContato("Tommy"); //Procura por um contato
    }
}
