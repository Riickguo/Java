import java.util.ArrayList;

public class Corso {
    private String nome;
    private String codice;
    private ArrayList<Studente> studenti;

    public Corso(String nome, String codice){
        this.nome = nome;
        this.codice = codice;
        this.studenti = new ArrayList<>();
    }

    public void aggiungi(Studente studente){
        if (!studenti.contains(studente)) {
            studenti.add(studente);
        }
    }
    public void rimuovi(Studente studente){
        studenti.remove(studente);
    }

    public void stampaLista() {
        System.out.println("Studenti iscritti al corso                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                " + "\n " + this.nome + " " + this.codice + ":");
        if (studenti.isEmpty()) {
            System.out.println("- Nessuno studente iscritto.");
        } else {
            for (Studente studente : studenti) {
                System.out.println(studente + "\n ");
            }
        }
    }
}
