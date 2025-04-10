public class Main {
    public static void main(String args[]){
        Universita universita = new Universita("Sapienza");

        Corso corso1 = new Corso("Informatica", "1234");
        Corso corso2 = new Corso("Scienze", "4321");

        universita.aggiungiCorso(corso1);
        universita.aggiungiCorso(corso2);

        Studente studente1 = new Studente("Mario", "Rossi", "M12345");
        Studente studente2 = new Studente("Luigi", "Verdi", "L67890");

        corso1.aggiungi(studente1);
        corso1.aggiungi(studente2);
        corso2.aggiungi(studente2);

        universita.stampaLista();

    }
}
