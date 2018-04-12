package ex12Telefonia;

public interface Controller {

    void preguntesMenu();

    void entraClient();
    void entraTrucadaClient();
    void facturaAnual(Client c);
    void escriureFacturaDeClient();

    Integer preguntaInteger();
    Double preguntaDouble();
    String preguntaString();

}
