package ex15Herencia;

public class test {

    public static void main(String[] args) {

        ObjecteGeometric c1 = new Cercle(10.5, 30.5, "negre", 21.43);
        ObjecteGeometric q1 = new Quadrat(29.5, 33.2, "groc", 80.5);

        System.out.println(c1.toString());
        System.out.println(q1.toString());
    }
}
