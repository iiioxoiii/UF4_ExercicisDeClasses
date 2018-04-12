package ex11FerriesCamions;

public interface Ferry {

    String getPortDesti();
    String getMatricula();
    Double getPreuTonaCamio();
    Double getPesMaxim();
    void setPortDesti(String portDesti);
    void setMatricula(String matricula);
    void setPreuTona(Double preu);
    void setPesMaxim(Double pesMax);
    void pintaCarrega();
    void infoCamio(Integer n);



    Integer getNumCamions();
    Double pesCamionsEmbarcats();
    boolean esPossibleEmbarcar(Camio c);
    boolean inCamio(Camio c);
    boolean camioEsdins(Camio c);
    boolean outCamio(Camio c);

    Double preuEmbarcament(Camio c);
    Double peatgeRecaptat();









}
