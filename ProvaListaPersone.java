java.util.Scanner;

public class ProvaListaPersone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Chiede all'utente di specificare la dimensione massima dell'elenco
        System.out.print("Inserisci la dimensione massima dell'elenco: ");
        int dimensioneMassima = scanner.nextInt();
        scanner.nextLine();



        ElencoPersone elencoPersone = new ElencoPersone(dimensioneMassima);


        while (true) {
            System.out.println("Vuoi inserire una Persona, uno Studente o un Docente? (P/S/D)");
            System.out.println("Premi Q per uscire.");
            String scelta = scanner.nextLine();

            if (scelta.equals("Q")) {
                break;
            }

            switch (scelta) {
                case "P":
                    System.out.print("Inserisci Codice Fiscale: ");
                    String codiceFiscale = scanner.nextLine();
                    System.out.print("Inserisci Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Inserisci Cognome: ");
                    String cognome = scanner.nextLine();
                    Persona persona = new Persona(codiceFiscale, nome, cognome);
                    elencoPersone.aggiungi(persona);
                    break;

                case "S": // Inserimento di uno Studente
                    System.out.print("Inserisci Codice Fiscale: ");
                    codiceFiscale = scanner.nextLine();
                    System.out.print("Inserisci Nome: ");
                    nome = scanner.nextLine();
                    System.out.print("Inserisci Cognome: ");
                    cognome = scanner.nextLine();
                    System.out.print("Inserisci Matricola: ");
                    String matricola = scanner.nextLine();
                    System.out.print("Inserisci Università: ");
                    String universita = scanner.nextLine();
                    Studente studente = new Studente(codiceFiscale, nome, cognome, matricola, universita);
                    elencoPersone.aggiungi(studente);
                    break;

                case "D":
                    System.out.print("Inserisci Codice Fiscale: ");
                    codiceFiscale = scanner.nextLine();
                    System.out.print("Inserisci Nome: ");
                    nome = scanner.nextLine();
                    System.out.print("Inserisci Cognome: ");
                    cognome = scanner.nextLine();
                    System.out.print("Inserisci Materia: ");
                    String materia = scanner.nextLine();
                    System.out.print("Inserisci Salario: ");
                    double salario = scanner.nextDouble();
                    scanner.nextLine();
                    Docente docente = new Docente(codiceFiscale, nome, cognome, materia, salario);
                    elencoPersone.aggiungi(docente);
                    break;

                default:
                    System.out.println("Scelta non valida. Riprova.");
                    break;
            }
        }

        // Stampa l'elenco delle persone inserite
        System.out.println("\n" + elencoPersone);

        scanner.close();
    }
}
