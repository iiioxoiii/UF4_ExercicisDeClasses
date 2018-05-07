package ex20PolimorfismeMesClassesAbstractes.ex2Aquarium;

public class Peix extends Organisme {

    String procedencia;
    Double longitud;
    TipusDietaPeix t;

    public Peix(String nom, String familia, TipusLlum ll, Double tempMaxima, Double tempMinima, Double pHMax, Double pHMin, String procedencia, TipusDietaPeix tipus, Double longitud) {
        super(nom, familia, ll, tempMaxima, tempMinima, pHMax, pHMin);
        this.procedencia = procedencia;
        this.t = tipus;
        this.longitud = longitud;
    }

    public void getDieta (){
        if(this.t.equals(TipusDietaPeix.W)){
            System.out.println("Algues");
        }else if (this.t.equals(TipusDietaPeix.O)){
            System.out.println("Omníbor");
        }else{
            System.out.println("Fulles");
        }
    }


}
