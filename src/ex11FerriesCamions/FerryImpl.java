package ex11FerriesCamions;


import java.util.HashMap;
import java.util.Iterator;

public class FerryImpl implements Ferry {

    private String portDesti;
    private String matricula;
    private Double preuTona;
    private Double pesMaxim;

    public HashMap<Integer, Camio> camions = new HashMap<>() ;


    public FerryImpl() {
        this.portDesti = "<sense destí>";
        this.matricula = "000-00-00";
        this.preuTona =  0.00;
        this.pesMaxim = 0.00;
    }


    public void infoCamio(Integer n){
        
    }




    public void pintaCarrega(){

        try {
            System.out.println("Numero de camions: " + camions.size());
            for (HashMap.Entry<Integer, Camio> element : camions.entrySet()) {
                System.out.println("Matricula:" + element.getValue().getMatricula() + ". pes:" + element.getValue().getPes());
            }
        }catch (NullPointerException e){
            System.out.println("No hi ha cap camió embarcat");
        }
    }


    public Integer getNumCamions(){

        Integer num;

        try {
            num = this.camions.size();
        }catch (NullPointerException e){
            num = 0;
            System.out.println("No hi ha cap camió embarcat");
        }

        return num;
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
        try {
            for (HashMap.Entry<Integer, Camio> element : camions.entrySet()) {
                if (element.getValue().equals(c)){
                    esDins = true;
                }
            }


        }catch (NullPointerException e){
            esDins = false;
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

        try{

            camions.put(camions.size() + 1, c);
            return entra;

        }catch (NullPointerException e){
            entra =  false;
            return entra;
        }


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

    public Double pesCamionsEmbarcats() {

        Double pes = 0.0;

        try {

            for (HashMap.Entry<Integer, Camio> element : camions.entrySet()) {
                pes = pes + element.getValue().getPes();
            }

            return pes;

        }catch (NullPointerException e){

            return 0.0;

        }



    }

    public void pintaCamionsDeMap(){

        try {

            Iterator it = camions.keySet().iterator();

            while (it.hasNext()){
                HashMap.Entry ent = (HashMap.Entry)it.next();
                Camio c = (Camio) ent.getValue();
                System.out.println(c.toString());
            }

        }catch (NullPointerException e){
            System.out.println("Shit!!");
        }


    }


    @Override
    public boolean esPossibleEmbarcar(Camio c) {

        boolean esPossible = false;
        if(c.getPes()+pesCamionsEmbarcats() <= this.pesMaxim){
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

    @Override
    public String toString() {
        return "FerryImpl{" +
                "portDesti='" + portDesti + '\'' +
                ", matricula='" + matricula + '\'' +
                ", preuTona=" + preuTona +
                ", pesMaxim=" + pesMaxim +
                ", camions=" + getNumCamions() +
                '}';
    }


}
