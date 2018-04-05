package ex11FerriesCamions;

import java.util.Map;

public class FerryImpl implements Ferry {

    private String portDesti;
    private String matricula;
    private Double preuTona;
    private Double pesMaxim;
    private Map<Integer, Camio> camions;


    public FerryImpl() {
        this.portDesti = "<sense destí>";
        this.matricula = "000-00-00";
        this.preuTona =  0.00;
        this.pesMaxim = 0.00;
    }


    public Integer getNumCamions(){
        return camions.size();
    }

    public String getPortDesti() {
        return portDesti;
    }

    public String getMatricula() {
        return matricula;
    }

    public Double getPreuTonaCamio() {
        return preuTona;
    }

    public Double getPesMaxim() {
        return pesMaxim;
    }

    public boolean camioEsdins(Camio c){
        boolean esDins = false;

        if(camions.containsValue(c)){
            esDins = true;
        }

        return esDins;
    }


    public boolean outCamio(Camio c){

        boolean fora = false;

        if(camioEsdins(c)){
            camions.remove(c);
            fora = true;
        }

        return fora;
    }

    public boolean inCamio(Camio c){

        boolean entra = false;

        if(!camioEsdins(c)){
            camions.put(getNumCamions()+1,c);
            entra = true;
        }

        return entra;
    }


    public void setPortDesti(String portDesti) {
        this.portDesti = portDesti;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setPreuTona(Double preu) {
         this.preuTona = preu;
    }

    public void setPesMaxim(Double pesMax) {
        this.pesMaxim = pesMax;
    }

    public Integer camionsEmbarcats() {
        return camions.size();
    }

    public Double pesCamionsEmbarcats() {

        Double pes = 0.0;

        for (Map.Entry<Integer,Camio> c: camions.entrySet()) {
            pes = pes + c.getValue().getPes();
        }

        return pes;

    }


    @Override
    public boolean esPossibleEmbarcar(Camio c) {

        boolean esPossible = false;
        if(c.getPes()+pesCamionsEmbarcats() <= pesMaxim){
            esPossible = true;
        }

        return esPossible;
    }

    @Override
    public Double preuEmbarcament(Camio c) {

        return c.getPes()*preuTona;
    }

    @Override
    public Double peatgeRecaptat() {

        return pesCamionsEmbarcats()*preuTona;
    }
}
