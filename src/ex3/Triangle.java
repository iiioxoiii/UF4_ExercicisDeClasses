package ex3;

public class Triangle {

    private int c1;
    private int c2;
    private int c3;


    public Triangle() {
        this.c1 = 3;
        this.c2 = 4;
        this.c3 = 5;
    }


    public Triangle(int c1, int c2, int c3) {
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
    }

    public int perimetre(){
        return c1+c2+c3;
    }

    //stackoverflow.com/questions/19723467/herons-formula-used-in-java-but-wrong-values
    public double area(){
        double s = (this.c1 + this.c2 + this.c3)/2.0d;
        double x = (s * (s-this.c1) * (s-this.c2) * (s-this.c3));
        double Area= Math.sqrt(x);
        return Area;
    }


}
