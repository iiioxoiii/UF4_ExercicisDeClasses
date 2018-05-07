package ex21Interficies.ex3CosGeometric;

public class Piramide extends Figura3D {

    Double altura;
    Rectangle rectangle;


    public Piramide(Double altura, Rectangle rectangle) {
        this.altura = altura;
        this.rectangle = rectangle;
    }

    @Override
    public Double volum() {
        return this.rectangle.area()*this.altura;
    }

}
