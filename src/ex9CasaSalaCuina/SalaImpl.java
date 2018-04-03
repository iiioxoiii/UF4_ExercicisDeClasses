package ex9CasaSalaCuina;

public class SalaImpl implements Sala{

    int NumeroDeTelevisions;
    String TipusDeSala;


    public SalaImpl(){
        this.NumeroDeTelevisions = 0;
        this.TipusDeSala="desconegut";
    }


    public int getNumeroDeTelevisions() {

        return this.NumeroDeTelevisions;
    }

    public String getTipusDeSala() {
        return this.TipusDeSala;
    }

    public void setNumeroDeTelevisions(int n) {
        this.NumeroDeTelevisions = n;
    }

    public void setTipusDeSala(String tipusDeSala) {
        this.TipusDeSala = tipusDeSala;
    }

    @Override
    public String toString() {
        return "SalaImpl{" +
                "NumeroDeTelevisions=" + NumeroDeTelevisions +
                ", TipusDeSala='" + TipusDeSala + '\'' +
                '}';
    }
}
