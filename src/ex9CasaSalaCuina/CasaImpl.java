package ex9CasaSalaCuina;

public class CasaImpl implements Casa {

    double superficie;
    String direccio;
    Sala salaCasa;
    Cuina cuinaCasa;

    //superfície(double), direcció(String), salaCasa(tipus Sala) i cuinaCasa (tipus Cuina)

    public double getSuperficie() {
        return this.superficie;
    }

    public String getDireccio(){
        return this.direccio;
    }

    public Sala getSalaCasa() {
        return this.salaCasa;
    }

    public Cuina getCuinaCasa() {
        return this.cuinaCasa;
    }

    public void setSuperficie(double s){
        this.superficie = s;
    }

    public void  setDireccio(String d) {
        this.direccio = d;
    }

    public void setCuinaCasa(Cuina cuinaCasa) {
        this.cuinaCasa = cuinaCasa;
    }
}
