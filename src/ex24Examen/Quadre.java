package ex24Examen;

public class Quadre extends Obra implements Subastable{

    String tecnica;
    Double altura;
    Double amplada;


    public Quadre(){}

    public Quadre(String nom, String autor, Double preuCompra, String tecnica, Double altura, Double amplada) {
        super(nom, autor, preuCompra);
        this.tecnica = tecnica;
        this.altura = altura;
        this.amplada = amplada;
    }

    @Override
    public void realitzaSubasta() {
        this.preuVenda = preuCompra*2;
        this.venuda = true;
    }

    public String getTecnica() {
        return tecnica;
    }

    public void setTecnica(String tecnica) {
        this.tecnica = tecnica;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getAmplada() {
        return amplada;
    }

    public void setAmplada(Double amplada) {
        this.amplada = amplada;
    }

    @Override
    public String toString() {
        return "Quadre{" +
                "tecnica='" + tecnica + '\'' +
                ", altura=" + altura +
                ", amplada=" + amplada +
                ", nom='" + nom + '\'' +
                ", autor='" + autor + '\'' +
                ", preuCompra=" + preuCompra +
                ", preuVenda=" + preuVenda +
                ", venuda=" + venuda +
                '}';
    }
}
