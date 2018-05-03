package ext19Empleats;

public class Repartidor extends Empleat {

    protected String zona;

    public Repartidor(String nom, String cognom, Integer edat, Double salari, String zona) {
        super(nom, cognom, edat, salari);
        this.zona = zona;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

}
