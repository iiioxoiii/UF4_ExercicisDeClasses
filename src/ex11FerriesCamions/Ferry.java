package ex11FerriesCamions;

public interface Ferry {

    String getPortDesti();
    String getMatricula();
    Double getPreuTonaCamio();
    Double getPesMaxim();
    Integer camionsEmbarcats();
    Double pesCamionsEmbarcats();
    boolean esPossibleEmbarcar(Camio c);
    Double preuEmbarcament(Camio c);
    Double peatgeRecaptat();

    void setPortDesti(String portDesti);
    void setMatricula(String matricula);
    void setPreuTona(Double preu);
    void setPesMaxim(Double pesMax);







}
