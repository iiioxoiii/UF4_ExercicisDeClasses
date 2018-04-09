package ex11FerriesCamions;

public interface Controller {

    void preguntesMenu();
    void mostraPesCamions();
    void determinaCamioEmbarcat();
    void determinaCamioPotEntrar();
    void embarcarUnCamio();
    void determinaNumCamionsEmbarcats();
    void determinaPeatgeCamio();

    Integer preguntaInteger();
    Double preguntaDouble();
    String preguntaString();


    void configuraFerry();
    void testHashMap();
}
