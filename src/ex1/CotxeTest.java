package ex1;

public class CotxeTest {


    public static void main(String[] args) {

        Cotxe c1 = new Cotxe();
        Cotxe c2 = new Cotxe();

        c1.setModel("A4");
        c1.setMatricula("34566ASD");

        c2.setModel("Yaris");
        c2.setMatricula("12123ADJD");

        System.out.println(c1.getModel());
        System.out.println(c2.getModel());

    }

}
