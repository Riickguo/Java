import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inserimentoDati = new Scanner(System.in);



        System.out.print("Inserisci la base: ");
        float base = inserimentoDati.nextFloat();
        System.out.print("Inserisci l'altezza: ");
        float altezza = inserimentoDati.nextFloat();


        Rettangolo r1 = new Rettangolo(base,altezza);
        System.out.print(r1.tostring());

    }
}
