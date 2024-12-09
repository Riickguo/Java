import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Crea un oggetto Scanner per leggere gli input da tastiera
        Scanner inserimentoDati = new Scanner(System.in);

        System.out.print("Inserisci la targa: ");
        String targa = inserimentoDati.nextLine();

        System.out.print("Inserisci la marca: ");
        String marca = inserimentoDati.nextLine();

        System.out.print("Inserisci il modello: ");
        String modello = inserimentoDati.nextLine();

        System.out.print("Inserisci la cilindrata: ");
        int cilindrata = inserimentoDati.nextInt();

        System.out.print("Inserisci l'anno di acquisto: ");
        int annoAcquisto = inserimentoDati.nextInt();

        System.out.print("Inserisci il numero di posti: ");
        int numeroPosti = inserimentoDati.nextInt();

        Veicolo v1 = new Veicolo(targa,marca,modello,cilindrata,annoAcquisto,numeroPosti);
        // Stampa i dati inseriti
        System.out.println("\n " + v1.toString());


        inserimentoDati.close();
    }
}
