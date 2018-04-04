package ex9CasaSalaCuina;

public class CasaImpl implements Casa {

    double superficie;
    String direccio;
    Sala salaCasa;
    Cuina cuinaCasa;


    public CasaImpl(){
        this.salaCasa = new SalaImpl();
        this.superficie = 0.0;
        this.direccio = "<sense direcció>";
        this.cuinaCasa = new CuinaImpl();
    }

    @Override
    public double getSuperficie() {
        return superficie;
    }

    @Override
    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    @Override
    public String getDireccio() {
        return direccio;
    }

    @Override
    public void setDireccio(String direccio) {
        this.direccio = direccio;
    }

    @Override
    public Sala getSalaCasa() {
        return salaCasa;
    }

    @Override
    public void setSalaCasa(Sala salaCasa) {
        this.salaCasa = salaCasa;
    }

    @Override
    public Cuina getCuinaCasa() {
        return cuinaCasa;
    }

    @Override
    public void setCuinaCasa(Cuina cuinaCasa) {
        this.cuinaCasa = cuinaCasa;
    }

    @Override
    public String toString() {
        return  "\t"+ "\"Casa\":" + "\t" + "{" +"\n" +
                "\t\t" + "\"superficie\"=" + "\"" +superficie + "\"," +"\n" +
                "\t\t"+"\"direccio\"="+ "\"" + direccio + "\"," +
                salaCasa +
                cuinaCasa + "\n" +
                "\t"+ '}';
    }
}
