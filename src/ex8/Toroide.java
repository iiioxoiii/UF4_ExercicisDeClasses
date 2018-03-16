package ex8;

public class Toroide {


    /** Volem determinar el pes de l'anell (gr) , el preu de l'or (€)
     * emprat en la seva fabricació, i el preu de venda de l'anell als majoristes (€).
     * El cost de fabricació de l'aliança sense tenir en compte el valor de l'or és
     * de 40 €, el preu de l'or és de 10 € el gram, el marge de benefici és del
     * 210 % del cost total de l'anell i el pes específic de l'or és de 19,3 gr/cm3
     **/

    private double R;
    private double r;

    private double preuOr = 10.;
    private double preuFabricacio = 40.;

    //210% ---> 2.1;
    private double margeDeBenefici = 2.1;

    //grm/cm3
    private double pesEspecific = 19.3;



    //Entrada en cm3
    public Toroide(double R, double r1) {
        this.R = R;
        this.r = r1;
    }


    public double volumenToro(){
        return 2 * (Math.pow(Math.PI, 2)) * this.R * Math.pow(this.r,2);
    }

    public double anellPes(){
        return volumenToro()*pesEspecific;
    }

    public double anellCostOr(){
        return anellPes()*preuOr;
    }

    public double anellPreuSortida(){
        return (anellCostOr()*margeDeBenefici) + preuFabricacio;
    }


}
