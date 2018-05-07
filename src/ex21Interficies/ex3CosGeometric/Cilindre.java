package ex21Interficies.ex3CosGeometric;

public class Cilindre extends Figura3D{

    Double altura;
    Cercle cercle;


    public Cilindre(Double altura, Cercle cercle) {
        this.altura = altura;
        this.cercle = cercle;
    }

    @Override
    public Double volum() {
        return this.cercle.area()*this.altura;
    }
}
