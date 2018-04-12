package ex12Telefonia;

import java.util.ArrayList;
import java.util.Scanner;

    public class ControllerImpl implements Controller {

        private ArrayList<Client> LlistaClients = new ArrayList<>();
        private ArrayList<Trucada> LlistaTrucades = new ArrayList<>();


        public void entraClient() {
            System.out.println("Entra el DNI del client:");
            String dni = preguntaString();
            System.out.println("Entra el nom del client:");
            String nom = preguntaString();
            System.out.println("Entra tarifa (0.0):");
            Double tarifa = preguntaDouble();

            Client t = new ClientImpl(nom,dni,tarifa);

            if(noEstaEnLlista(t)) {
                LlistaClients.add(t);
            }
        }

        private boolean noEstaEnLlista(Client o){
            boolean noEstaEnLlista = true;
            for (Client c:LlistaClients) {
                if(c.equals(o)){
                    return noEstaEnLlista;
                }
            }
            return noEstaEnLlista;
        }


        @Override
        public void entraTrucadaClient() {
            System.out.println("Entra el DNI del client:");
            String dni = preguntaString();
            if (existeixClient(dni)) {
                System.out.println("Entra número destí: ");
                String numDesti = preguntaString();
                System.out.println("Entra duració trucada (0.0):");
                Double duracio = preguntaDouble();

                LlistaTrucades.add(new TrucadaImpl(retornaClient(dni), numDesti, duracio));

            } else {
                System.out.println("El dni" + dni + "no correspón a cap client registrat");
            }
        }


        public boolean existeixClient(String dni){

            boolean existeix = false;
            for(Client c: LlistaClients){
                if(c.getDNI().equals(dni)){
                    existeix = true;
                }
            }

            return existeix;
        }


        public Client retornaClient(String dni){

            Client client = null;
            for(Client c: LlistaClients){
                if(c.getDNI().equals(dni)){
                    client = c;
                }
            }

            return client;
        }

        public void facturaAnual(Client c) {

            System.out.println("Factura anual del client "+ c.toString());

            Double totalTemps = 0.0;
            Double totalDespesa = 0.0;

            for (Trucada t: LlistaTrucades){
                if(t.getClient().equals(c)){
                    System.out.println(t.toString());
                    totalTemps = totalTemps + t.getMinutsTrucada();
                }
            }
            totalDespesa=totalTemps*c.getPreuTrucada();

            System.out.println("total temps: " + totalTemps);
            System.out.println("total despesa: "+ totalDespesa);

        }

        public void escriureFacturaDeClient() {
            for (Client c: LlistaClients) {
                facturaAnual(c);
            }
        }


        public void preguntesMenu(){

            System.out.println("1) afegirClient");
            System.out.println("2) Determina si el camió està embarcat");
            System.out.println("3) Determina si el camió pot embarcar perquè al ferry queda lloc");
            System.out.println("4) Embarcar un camió");
            System.out.println("0) exit");
        }



        public String preguntaString(){

            Scanner sc = new Scanner(System.in);
            String sortida = sc.nextLine();

            return sortida;
        }

        public Double preguntaDouble(){

            Scanner sc = new Scanner(System.in);
            Double sortida = sc.nextDouble();

            return sortida;
        }

        public Integer preguntaInteger(){

            Scanner sc = new Scanner(System.in);
            Integer sortida = sc.nextInt();

            return sortida;

        }

    }
