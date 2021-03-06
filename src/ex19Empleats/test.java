package ex19Empleats;

public class test {


    public static void main(String[] args) {

        Comercial e1 = new Comercial("Luis", "Pérez", 33 , 870.65);
        Repartidor e2 = new Repartidor("Luis", "Pérez", 33 , 870.65, "Sud");
        Empleat e3 = new Empleat("Luis", "Pérez", 33 , 870.65);


        /** Compara classes, utilitza el getClass, instanceOf, prova la igualtat
         * entre dos Objectes (equalsTo).
         **/

        System.out.println(e1.getClass().getSimpleName());
        System.out.println(e2.getClass().getSimpleName());
        System.out.println(e3.getClass().getSimpleName());

        System.out.println(e1 instanceof Comercial);
        System.out.println(e1 instanceof Empleat);

        System.out.println(e1.equals(e2));
        System.out.println(e1.equals(e1));
    }

}
