package ex9CasaSalaCuina;

public class testCasaSalaCuina {

    public static void main(String[] args) {
        Sala r1 = new SalaImpl();
        Cuina k1 = new CuinaImpl();

        Casa h1 = new CasaImpl();

        System.out.println(h1.toString());
    }


}
