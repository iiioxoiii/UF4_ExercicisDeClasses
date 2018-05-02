package ex15Herencia;

public abstract class ObjecteGeometric {

    private Double x;
    private Double y;
    private String color;

    public ObjecteGeometric(Double x, Double y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }


    public abstract Double perimetre();

    public abstract Double area();


    @Override
    public String toString() {
        return "ObjecteGeometric{" +
                "x=" + x +
                ", y=" + y +
                ", color='" + color + '\'' +
                '}';
    }
}
