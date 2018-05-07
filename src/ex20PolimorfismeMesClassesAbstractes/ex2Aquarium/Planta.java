package ex20PolimorfismeMesClassesAbstractes.ex2Aquarium;

public class Planta extends Organisme{
    TipusPlanta tipus;

    public Planta(String nom, String familia, TipusLlum ll, Double tempMaxima, Double tempMinima, Double pHMax, Double pHMin, TipusPlanta tipus) {
        super(nom, familia, ll, tempMaxima, tempMinima, pHMax, pHMin);
        this.tipus = tipus;
    }

    public void getTipusPlanta(){
        if(this.tipus.equals(TipusPlanta.S)){
            System.out.println("Titja");
        }else if (this.tipus.equals(TipusPlanta.B)){
            System.out.println("Bulb");
        }else{
            System.out.println("Arrels");
        }
    }
}