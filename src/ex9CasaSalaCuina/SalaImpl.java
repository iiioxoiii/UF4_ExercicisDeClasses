package ex9CasaSalaCuina;

public class SalaImpl implements Sala{

    int NumeroDeTelevisions;
    String TipusDeSala;


    @Override
    public int getNumeroDeTelevisions() {
        return NumeroDeTelevisions;
    }

    @Override
    public void setNumeroDeTelevisions(int numeroDeTelevisions) {
        NumeroDeTelevisions = numeroDeTelevisions;
    }

    public String getTipusSala() {
        return TipusDeSala;
    }

    public void setTipusSala(String tipusDeSala) {
        TipusDeSala = tipusDeSala;
    }

    @Override
    public String toString() {
        return
                "\n"+ "\t\t"+ "\"NumeroDeTelevisions\"=" + "\""+ NumeroDeTelevisions + "\""+ "," + "\n" +
                "\t\t"+ "\"TipusDeSala\"=" + "\"" + TipusDeSala + "\", "+ "\n";
    }
}
