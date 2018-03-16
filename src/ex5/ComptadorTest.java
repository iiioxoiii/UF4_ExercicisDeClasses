package ex5;

import com.sun.org.apache.xpath.internal.SourceTree;

public class ComptadorTest {

    public static void main(String[] args) {

        Comptador c = new Comptador();
        c.incrementa();
        c.incrementa();
        System.out.println(c.getNumero());
        c.incrementa();
        System.out.println(c.getNumero());
        c.posaZero();
        System.out.println(c.getNumero());

    }
}