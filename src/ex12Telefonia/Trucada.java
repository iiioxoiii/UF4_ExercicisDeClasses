package ex12Telefonia;

public interface Trucada {

    Client getClient();
    String getDesti();
    Double getMinutsTrucada();

    void setClient(Client c);
    void setDesti(String d);
    void setMinutsTrucada(Double minuts);
}
