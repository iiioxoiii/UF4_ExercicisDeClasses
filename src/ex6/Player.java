package ex6;

public class Player {

    private String nom;
    private Position p;

    public Player(){
    }

    public Player(String nom){

        this.nom = nom;
    }

    public Player(Position p){

        this.p = p;
    }

    public Player(Position p, String nom){
        this.p = p;
        this.nom = nom;
    }

    public void moveRight(){
        this.p.incX();
    }

    public void moveLeft(){
        this.p.decX();
    }

    public void jump(){
        this.p.incX();
    }

    public void fall(){
        this.p.decY();
    }



    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Position getPosicio(){
        return this.p;
    }



}
