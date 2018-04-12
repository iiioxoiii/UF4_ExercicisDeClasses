package ex11FerriesCamions;

import java.util.Scanner;

public class ControllerImpl implements Controller {


    Ferry ferry = new FerryImpl();


    public void determinaCamioNumero(){
        System.out.println("Escriu la info del numero de camio: ");
        Integer num = preguntaInteger();

        ferry.infoCamio(num);
    }


    public void determinaNumCamionsEmbarcats(){
        System.out.println("Num camions embarcats: " + ferry.getNumCamions());
    }


    public void determinaPeatgeCamio(){
        System.out.print("Escriu el pes del camio: ");
        Double pes = preguntaDouble();

        Camio camio = new CamioImpl(pes);

        System.out.println("El peatge per aquest ferry sera de " + camio.getPes()*ferry.getPreuTonaCamio());
    }



    public void embarcarUnCamio(){

        System.out.print("Escriu la matricula del camio:");
        String matricula = preguntaString();

        System.out.print("Escriu el pes del camio: ");
        Double pes = preguntaDouble();

        Camio camio = new CamioImpl(matricula,pes);

        if(ferry.esPossibleEmbarcar(camio) && !ferry.camioEsdins(camio)){
            ferry.inCamio(camio);
            System.out.println("Camio embarcat!!");
        }else{
            System.out.println("No s'ha pogut embarcar el camió");
        }

    }



    public void determinaCamioPotEntrar(){

        Scanner sc = new Scanner(System.in);

        System.out.print("Escriu la matricula del camio:");
        String matricula = preguntaString();

        System.out.print("Escriu el pes del camio: ");
        Double pes = preguntaDouble();

        Camio camio = new CamioImpl(matricula,pes);

        if(ferry.esPossibleEmbarcar(camio) && !ferry.camioEsdins(camio)){
            System.out.println("Es possible embarcar");
        }else{
            System.out.println("No es possible");
        }

    }


    public void mostraPesCamions(){

        System.out.println(ferry.pesCamionsEmbarcats());
    }


    public void determinaCamioEmbarcat(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriu la matricula del camio:");
        String matricula = preguntaString();

        CamioImpl camio = new CamioImpl(matricula);

        if(ferry.camioEsdins(camio)){
            System.out.println("El camio està embarcat");
        }else{
            System.out.println("El camio no està embarcat");
        }

    }


    public void configuraFerry(){

        System.out.println("Matricula del ferry:");
        ferry.setMatricula(preguntaString());
        System.out.println("Capacitat màxima (T) 0.0:");
        ferry.setPesMaxim(preguntaDouble());
        System.out.println("Port de desti:");
        ferry.setPortDesti(preguntaString());
        System.out.println("Preu de la tona 0.0:");
        ferry.setPreuTona(preguntaDouble());
    }


    public void preguntesMenu(){

        System.out.println("1) Pes camions embarcats");
        System.out.println("2) Determina si el camió està embarcat");
        System.out.println("3) Determina si el camió pot embarcar perquè al ferry queda lloc");
        System.out.println("4) Embarcar un camió");
        System.out.println("5) Determinar el número de camions embarcats");
        System.out.println("6) Determinar l'import del peatge d'un camió");
        System.out.println("9) <exit>");
    }


    public void testHashMap() {
        ferry.pintaCarrega();
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
