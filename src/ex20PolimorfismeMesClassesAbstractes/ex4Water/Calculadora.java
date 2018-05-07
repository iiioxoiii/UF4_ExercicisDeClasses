package ex20PolimorfismeMesClassesAbstractes.ex4Water;

import java.util.ArrayList;

public class Calculadora {

    TipusClient cat;
    Factura f;


    public Calculadora(TipusClient cat, Factura f) {
        this.cat = cat;
        this.f = f;
    }

    public void pintaFactura(){

        //Aquest mètode només pinta els resultats de d'un càlcul aplicat als
        //atributs de la factura.


        if(cat.equals(TipusClient.CN)){
            System.out.println("Per a un Client Normal:");
            System.out.println("Consum:" + f.consum);
            System.out.println("Sanejament:" + f.sanejament);
            System.out.println("Residuals:" + f.residuals );
            System.out.println("Descompte Aplicat a Sanejament:" + 0.0);
            System.out.println("Descompte Aplicat a Residuals:" + 0.0);


        }else if (cat.equals(TipusClient.F1)){
            System.out.println("Per a un client de família nombrosa de tipus 1:");
            System.out.println("Consum:" + f.consum);
            System.out.println("Sanejament:" + f.sanejament * 0.75);
            System.out.println("Residuals:" + f.residuals * 0.75);
            System.out.println("Descompte Aplicat a Sanejament:" + 25.0);
            System.out.println("Descompte Aplicat a Residuals:" + 25.0);


        }else{
            System.out.println("Per a un client de família nombrosa de tipus 2:");
            System.out.println("Consum:" + f.consum);
            System.out.println("Sanejament:" + f.sanejament * 0.25);
            System.out.println("Residuals:" + f.residuals * 0.5);
            System.out.println("Descompte Aplicat a Sanejament:" + 75.0);
            System.out.println("Descompte Aplicat a Residuals:" + 50.0);

        }
    }
}
