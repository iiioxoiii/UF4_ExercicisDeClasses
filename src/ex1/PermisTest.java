package ex1;

import ex1.PermisConduir;

public class PermisTest {

    public static void main(String[] args) {

        PermisConduir p1 = new PermisConduir();
        PermisConduir p2 = new PermisConduir();

        p1.setNom("B");
        p2.setNom("C1");

        p1.setTipusPermis("Cotxe");
        p2.setTipusPermis("Moto");

        p1.setPunts(10);
        p2.setPunts(10);

        p1.restarPunts(5);
        p1.imprimirPermis(p1);


    }
}
