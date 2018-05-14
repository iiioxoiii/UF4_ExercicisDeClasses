package ex24Examen;

public class Escultura extends Obra{

    String material;
    Double altura;
    Double amplada;
    Double profunditat;

    public Escultura(){}

    public Escultura(String nom, String autor, Double preuCompra, String material, Double altura, Double amplada, Double profunditat) {
        super(nom, autor,preuCompra);
        this.material = material;
        this.altura = altura;
        this.amplada = amplada;
        this.profunditat = profunditat;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
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

    public Double getProfunditat() {
        return profunditat;
    }

    public void setProfunditat(Double profunditat) {
        this.profunditat = profunditat;
    }

    @Override
    public String toString() {
        return "Escultura{" +
                "material='" + material + '\'' +
                ", altura=" + altura +
                ", amplada=" + amplada +
                ", profunditat=" + profunditat +
                ", nom='" + nom + '\'' +
                ", autor='" + autor + '\'' +
                ", preuCompra=" + preuCompra +
                ", preuVenda=" + preuVenda +
                ", venuda=" + venuda +
                '}';
    }
}
