package ex20PolimorfismeMesClassesAbstractes.ex1Transports;

import com.sun.org.apache.xpath.internal.SourceTree;

public class Metro extends Transport{

    Double preuBitllet;

    public Metro(String id, Double velocitat, Double preuBitllet) {
        super(id, velocitat);
        this.preuBitllet = preuBitllet;
    }


    @Override
    public Double preuPerDistancia(Double distancia) {

        Double resultat;

        if (distancia < 5) {
            return 1.0;
        }else{
            resultat = distancia / 5;
        }

        return resultat;
    }
}
