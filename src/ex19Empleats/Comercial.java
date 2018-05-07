package ex19Empleats;

public class Comercial extends Empleat {

    protected Double comisio;

    public Comercial(String nom, String cognom, Integer edat, Double salari) {
        super(nom, cognom, edat, salari);
    }

    public Double getComisio() {
        return comisio;
    }

    public void setComisio(Double comisio) {
        this.comisio = comisio;
    }
}
