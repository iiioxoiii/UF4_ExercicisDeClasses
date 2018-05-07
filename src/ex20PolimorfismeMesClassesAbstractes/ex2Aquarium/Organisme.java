package ex20PolimorfismeMesClassesAbstractes.ex2Aquarium;

public class Organisme {
    String nom;
    String familia;
    TipusLlum ll;
    Double tempMaxima;
    Double tempMinima;
    Double pHMax;
    Double pHMin;

    public Organisme(String nom, String familia, TipusLlum ll, Double tempMaxima, Double tempMinima, Double pHMax, Double pHMin) {
        this.nom = nom;
        this.familia = familia;
        this.ll = ll;
        this.tempMaxima = tempMaxima;
        this.tempMinima = tempMinima;
        this.pHMax = pHMax;
        this.pHMin = pHMin;
    }

    public String margesAcceptables(){
        return ("phMinim: "+ pHMin + ", phMax: "+ pHMax);
    }

    public String margesTemperatura(){
        return ("tempMin: "+ tempMinima + ", tempMax: "+ tempMaxima);
    }

    public void getTipusLlum (){
        if(this.ll.equals(TipusLlum.H)){
            System.out.println("Necessitats altes de llum");
        }else if (this.ll.equals(TipusLlum.M)){
            System.out.println("Necessitats mitjes de llum");
        }else{
            System.out.println("Necessitats baixes de llum");
        }
    }

}
