package ex24Examen;

public class Antiguitat extends Obra implements Subastable{

    Integer anyCreacio;
    String material;

    public Antiguitat(String nom, String autor, Double preuCompra, Integer anyCreacio, String material) {
        super(nom, autor, preuCompra);
        this.anyCreacio = anyCreacio;
        this.material = material;
    }

    @Override
    public void realitzaSubasta() {
        this.preuVenda = preuCompra/2;
        this.venuda = true;
    }

    public Integer getAnyCreacio() {
        return anyCreacio;
    }

    public void setAnyCreacio(Integer anyCreacio) {
        this.anyCreacio = anyCreacio;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Antiguitat{" +
                "anyCreacio=" + anyCreacio +
                ", material='" + material + '\'' +
                ", nom='" + nom + '\'' +
                ", autor='" + autor + '\'' +
                ", preuCompra=" + preuCompra +
                ", preuVenda=" + preuVenda +
                ", venuda=" + venuda +
                '}';
    }
}
