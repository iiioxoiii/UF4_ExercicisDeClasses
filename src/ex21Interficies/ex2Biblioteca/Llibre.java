package ex21Interficies.ex2Biblioteca;

public class Llibre implements Publicacio, Prestable{

    private String codi;
    private String titol;
    private Integer any;

    private Boolean prestat;

    public Llibre(String codi, String titol, Integer any) {
        this.codi = codi;
        this.titol = titol;
        this.any = any;
        this.prestat = false;
    }

    @Override
    public void prestar() {
        prestat = true;
    }

    @Override
    public void tornar() {
        prestat = false;
    }

    @Override
    public Boolean prestat() {
        return prestat;
    }


    @Override
    public void setCodi(String codi) {

    }

    @Override
    public void setTitol(String titol) {

    }

    @Override
    public void setAny(Integer any) {

    }

    @Override
    public String getCodi() {
        return null;
    }

    @Override
    public String getTitol() {
        return null;
    }

    @Override
    public Integer getAny() {
        return null;
    }

    @Override
    public String toString() {
        return "Llibre{" +
                "codi='" + codi + '\'' +
                ", titol='" + titol + '\'' +
                ", any=" + any +
                ", prestat=" + prestat +
                '}';
    }
}
