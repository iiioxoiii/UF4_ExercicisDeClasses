package ex7;

public class Cilindre {

    private double c;
    private double altura;

    public Cilindre(double c, double altura) {
        this.c = c;
        this.altura = altura;
    }

    public double areaTotal(){
        Cercle c = new Cercle(this.c);
        return (c.area()*2) + (c.getRadi()*this.altura);
    }

    public double volumen(){
        Cercle c = new Cercle(this.c);
        return (Math.PI* (c.getRadi()*c.getRadi())*this.altura);
    }

}
