package ex21Interficies.ex2Biblioteca;

public class Revista implements Publicacio{


    private String codi;
    private String titol;
    private Integer any;

    private Integer nombre;

    public Revista(String codi, String titol, Integer any, Integer nombre) {
        this.codi = codi;
        this.titol = titol;
        this.any = any;
        this.nombre = nombre;
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
        return "Revista{" +
                "codi='" + codi + '\'' +
                ", titol='" + titol + '\'' +
                ", any=" + any +
                ", nombre=" + nombre +
                '}';
    }



}
