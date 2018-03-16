package ex5;

/**
 * Crea i testeja una classe que emuli un comptador cíclic d'un dígit (0-9)
 * amb mètodes que ens permeti posar el comptador a 0, incrementar-lo i consultar
 * el seu valor.
 *
 **/

public class Comptador {

    private int numero;

    public Comptador(){
    }

    /**
    Mètode de comptador amb un dígit

     public void incrementa(){
        if(this.numero == 9){
            this.numero = 0;
        }else {
            this.numero++;
        }
    }
     **/

    //Mètode del l'exercici seguent amb dos digits
    public void incrementa(){
        if(this.numero == 99){
            this.numero = 0;
        }else {
            this.numero++;
        }
    }



    public void posaZero(){
        this.numero = 0;
    }

    public int getNumero() {
        return this.numero;
    }
}



