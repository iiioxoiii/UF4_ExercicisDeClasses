package ex15Herencia;

public class Cercle extends ObjecteGeometric {

    private Double radi;

    public Cercle(Double x, Double y, String color, Double radi) {
        super(x, y, color);
        this.radi = radi;
    }

    @Override
    public Double perimetre() {
        return 2*Math.PI*radi;
    }

    @Override
    public Double area() {
        return Math.PI*Math.pow(radi,2);
    }

    @Override
    public String toString() {
        return "Cercle{" +
                "radi=" + radi +
                "perímetre =" + perimetre() +
                "area =" + area() +
                '}';
    }
}
