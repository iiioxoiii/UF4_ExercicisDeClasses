package ex21Interficies.ex3CosGeometric;

public class Cercle extends Figura2D implements Constants{

    Double radi;

    public Cercle(Double radi) {
        this.radi = radi;
    }

    @Override
    public Double perimetre() {
        return 2*getNumeroPi()*radi;
    }

    @Override
    public Double area() {
        return getNumeroPi()*radi*radi;
    }
}
