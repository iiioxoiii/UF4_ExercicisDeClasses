package ex7;

public class Cercle {

    private double radi;

    Cercle(double radi){

        this.radi=radi;
    }


    public double getRadi() {

        return radi;
    }

    public void setRadi(int radi) {

        this.radi = radi;
    }

    public double perimetre(){

        return (2*Math.PI*this.radi);
    }

    public double area(){

        return (Math.PI*(this.radi*this.radi));
    }
}
