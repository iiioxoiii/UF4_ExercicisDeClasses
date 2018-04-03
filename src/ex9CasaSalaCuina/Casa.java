package ex9CasaSalaCuina;

public interface Casa {

    double getSuperficie(double a);
    Sala getSalaCasa(Sala s);
    Cuina getCuinaCasa (Cuina c);
    String getDireccio(String d);

    void setSalaCasa();
    void setCuinaCasa();
    void setDireccio();
    void setSuperficie();
}
