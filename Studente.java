public class Studente {
    private String nome;
    private String cognome;
    private String matricola;

    public Studente(String nome, String cognome, String matricola){
        this.nome = nome;
        this.cognome = cognome;
        this.matricola = matricola;
    }

    @Override
    public String toString(){
        return "Nome: " + this.nome + "\nCognome: " +
                this.cognome + "\nmatricola: " + this.matricola + "\n";
    }
}
