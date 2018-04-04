package ex9CasaSalaCuina;

public interface Casa {

    double getSuperficie();
    Sala getSalaCasa();
    Cuina getCuinaCasa ();
    String getDireccio();

    void setSalaCasa(Sala s);
    void setCuinaCasa(Cuina c);
    void setDireccio(String d);
    void setSuperficie(double a);
}
