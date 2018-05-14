package ex24Examen;

public abstract class Obra {

    String nom;
    String autor;
    Double preuCompra;
    Double preuVenda;
    Boolean venuda;

    public Obra(){}

    public Obra(String nom, String autor, Double preuCompra) {
        this.nom = nom;
        this.autor = autor;
        this.preuCompra = preuCompra;
        this.preuVenda = 0.0;
        this.venuda = false;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Double getPreuCompra() {
        return preuCompra;
    }

    public void setPreuCompra(Double preuCompra) {
        this.preuCompra = preuCompra;
    }

    public Double getPreuVenda() {
        return preuVenda;
    }

    public void setPreuVenda(Double preuVenda) {
        this.preuVenda = preuVenda;
    }

    public Boolean getVenuda() {
        return venuda;
    }

    public void setVenuda(Boolean venuda) {
        this.venuda = venuda;
    }


    @Override
    public String toString() {
        return "Obra{" +
                "nom='" + nom + '\'' +
                ", autor='" + autor + '\'' +
                ", preuCompra=" + preuCompra +
                ", preuVenda=" + preuVenda +
                ", venuda=" + venuda +
                '}';
    }
}
