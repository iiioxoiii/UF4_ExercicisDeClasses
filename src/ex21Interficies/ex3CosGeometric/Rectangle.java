package ex21Interficies.ex3CosGeometric;

public class Rectangle extends Figura2D{

    Double costatLlarg;
    Double costatCurt;

    public Rectangle(Double costatLlarg, Double costatCurt) {
        this.costatLlarg = costatLlarg;
        this.costatCurt = costatCurt;
    }

    @Override
    public Double perimetre() {
        return 2*costatCurt + 2*costatLlarg;
    }

    @Override
    public Double area() {
        return costatLlarg*costatCurt;
    }
}
