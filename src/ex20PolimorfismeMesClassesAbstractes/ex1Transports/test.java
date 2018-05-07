package ex20PolimorfismeMesClassesAbstractes.ex1Transports;

public class test {

    public static void main(String[] args) {

        Transport c1 = new Cotxe("bf23", 120.0, "Gasolina", 12.4, 2.3);

        System.out.println(c1.horesEnRecorrer(200.9));
        System.out.println(c1.id);
        System.out.println(c1.velocitat);

        Transport m1 = new Metro("F3443", 80.5, 4.56);
        System.out.println(m1.preuPerDistancia(43.2));

    }

}
