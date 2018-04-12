package ex12Telefonia;


public class testAplicacio {


    public static void main(String[] args) {
        testAplicacio inici = new testAplicacio();
        inici.go();
    }


    public void go(){

        Controller control = new ControllerImpl();

        boolean sortir = false;

        while(!sortir){
            control.preguntesMenu();

            Integer op = control.preguntaInteger();

            if(op.equals(1)){
                control.entraClient();
            }else if (op.equals(2)){
                control.entraTrucadaClient();
            }else if (op.equals(3)){
                control.escriureFacturaDeClient();
            }else if (op.equals(4)){
                control.llistarTotsElsClients();
            }else if (op.equals(0)) {
                sortir = true;
            }
        }

        System.out.println("by");

    }


    /**Creacio de clients

    Client c1 = new ClientImpl("Grao Rasis", "111331222",1.30);
    Client c4 = new ClientImpl("Bibi Fraus", "666001166",1.61);

    //Creacio de trucades
    Trucada t1 = new TrucadaImpl(c1,"4443322", 4.3);
    Trucada t2 = new TrucadaImpl(c1,"6665544", 3.7);
    Trucada t3 = new TrucadaImpl(c4,"5554433", 0.1);
    Trucada t4 = new TrucadaImpl(c3,"7754433", 3.5);
    Trucada t5 = new TrucadaImpl(c3,"3254433", 6.6);
     **/

}
