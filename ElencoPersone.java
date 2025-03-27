public class ElencoPersone {
    // Array per memorizzare le persone nell'elenco
    private Persona[] elenco;
    private int numeroMassimo;
    private int indice = 0; // Indice per tenere traccia del numero di persone aggiunte

    // Costruttore: crea un elenco con una dimensione massima specificata
    public ElencoPersone(int numeroMassimo) {
        this.numeroMassimo = numeroMassimo;
        this.elenco = new Persona[numeroMassimo];
    }


    public boolean aggiungi(Persona p) {
        if (indice < numeroMassimo) {
            elenco[indice] = p;
            indice++;
            return true;
        } else {
            System.out.println("L'elenco è pieno. Non è possibile aggiungere altre persone.");
            return false;
        }
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Elenco delle persone:\n");
        for (int i = 0; i < indice; i++) {
            sb.append(elenco[i].toString()).append("\n");
        }
        return sb.toString();
    }
}
