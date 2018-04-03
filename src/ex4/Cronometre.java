package ex4;
import java.util.Date;
import java.util.Scanner;


/**
 * 6. Crea i testeja una classe que modelitzi un cronòmetre que ens permeti
 * consultar el temps que ha passat des de que es posa en marxa, pausar-lo i
 * posar-lo a zero. Pensa i defineix els atributs i mètodes que creguis convenients.
 *
 * Pots usar la classe Date https://docs.oracle.com/javase/8/docs/api/java/util/Date.html
 * que guarda un instant de temps com un long que representa el número de milisegons
 * que han passat des del 01/01/1970 (https://es.wikipedia.org/wiki/Tiempo_Unix).
 *
 **/


/** pausar-lo i posar-lo a zero????? **/

public class Cronometre {

    private long inici;
    private long tempstotal;
    private long parcial = 0;
    private long fi;


    public static void main(String[] args) {
        Cronometre c = new Cronometre();
        c.menu();

    }


    public void menu(){


        while (true){
            System.out.println("::Cronometre::");
            System.out.println("1.Star 2.Pausa 3.Stop 4.Posa a zero:");

            Scanner sc = new Scanner (System.in);

            int opcio = sc.nextInt();

            if(opcio == 1){
                posaEnMarxa();
            }else if(opcio == 2){
                pausa();
            }else if(opcio == 3){
                stop();
            }else if (opcio == 4){
                posaAZero();
            }else{
                System.out.println("LOL");
            }
        }
    }

    public void pausa(){
        Date d = new Date();
        this.parcial = (d.getTime() - this.inici) + this.parcial;
        System.out.println(parcial);
    }

    public void posaEnMarxa(){
        Date d = new Date();
        this.inici = d.getTime();
        System.out.println("start!!...");
    }

    public void stop(){
        System.out.println("Stop: "+ calculaTemps());
    }

    public void posaAZero(){
        this.inici = 0;
    }


    public long calculaTemps(){
        Date d = new Date();
        return this.inici = d.getTime()-this.inici;

    }

}
