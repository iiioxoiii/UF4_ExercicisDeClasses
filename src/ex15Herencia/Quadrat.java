package ex15Herencia;

public class Quadrat extends ObjecteGeometric{

    private Double costat;

    public Quadrat(Double x, Double y, String color, Double costat) {
        super(x, y, color);
        this.costat = costat;
    }

    @Override
    public Double perimetre() {
        return costat*4;
    }

    @Override
    public Double area() {
        return costat*costat;
    }

    @Override
    public String toString() {
        return "Quadrat{" +
                "costat=" + costat +
                "perimetre =" + perimetre() +
                "area =" + area() +
                '}';
    }
}
