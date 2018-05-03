package ex12Telefonia;

public class TrucadaImpl implements Trucada {

    private Client client;
    private String numDesti;
    private Double minuts;

    public TrucadaImpl(Client client, String numDesti, Double minuts) {
        this.client = client;
        this.numDesti = numDesti;
        this.minuts = minuts;
    }

    @Override
    public Client getClient() {
        return client;
    }

    @Override
    public String getDesti() {
        return numDesti;
    }

    @Override
    public Double getMinutsTrucada() {
        return minuts;
    }

    @Override
    public void setClient(Client client) {
        this.client=client;
    }

    @Override
    public void setMinutsTrucada(Double minuts) {
        this.minuts = minuts;
    }

    @Override
    public void setDesti(String numDesti) {
        this.numDesti=numDesti;
    }


    @Override
    public String toString() {
        return "TrucadaImpl{" +
                "client=" + client +
                ", numDesti='" + numDesti + '\'' +
                ", minuts=" + minuts +
                '}';
    }
}