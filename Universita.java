import java.util.ArrayList;

public class Universita {
    private String nome;
    private ArrayList<Corso> corsi;


    public Universita(String nome) {
        this.nome = nome;
        this.corsi = new ArrayList<>();
    }


    public void aggiungiCorso(Corso corso) {
        if (!corsi.contains(corso)) {
            corsi.add(corso);
        }
    }


    public void stampaLista() {
        System.out.println("Elenco corsi dell'università " + nome + ":");
        for (Corso corso : corsi) {
            corso.stampaLista();
        }
    }
}
