package ex12Telefonia;

public interface Client {
    String getNom();
    String getDNI();
    Double getPreuTrucada();

    void setNom(String nom);
    void setDNI(String dni);
    void setPreuTrucada(Double preuMinut);
}
