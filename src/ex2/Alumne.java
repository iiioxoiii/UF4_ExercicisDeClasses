package ex2;

public class Alumne {

    private String nom;


    Alumne(){
    }

    Alumne(String nom){
        this.nom= nom;
    }


    public void setNom(String nom){
        this.nom = nom;

    }

    public void saluda(){
        System.out.println("Hola, sóc el " + this.nom);
    }
}
