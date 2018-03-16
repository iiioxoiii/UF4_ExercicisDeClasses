package ex6;


import java.util.ArrayList;
import java.util.Scanner;

/**
 * 0. Crea una classe Game amb un mètode main que mostri un menú per pantalla amb les següents opcions
 * (usant la classe Player de l'exercici anterior):

 a) Afegir nou jugador: aquesta opció crearà un nou objecte de la classe Player.
 Demanarà a l'usuari el nom i les coordenades inicials.

 b) Eliminar jugador: aquesta opció eliminarà l'últim jugador creat.

 c) Reset de la partida: elimina tots els jugador creats.

 d) Mostrar jugadors: mostrar per pantalla la informació de tots els jugadors.

 Per guardar els jugadors al main cal crear un vector de Players de 10 posicions.
 Quan el vector estigui plè no es podran crear més jugadors fins que no se n'elimini un
 (si s'intenta donarà un error per pantalla).**/

public class Game {



    ArrayList <Player> llista= new ArrayList<>();



    public static void main(String[] args) {
        Game joc1 = new Game();
        joc1.inici();
    }



    public void inici(){


        boolean sortir = false;

        while(sortir!=true){
            pintaMenu();
            int op = opcio();
            switch (op) {
                case 1:
                    afegirNouJugador();
                    break;
                case 2:
                    eliminarJugador();
                    break;
                case 3:
                    resetPartida();
                    break;
                case 4:
                    mostrarJugadors();
                    break;
                case 5:
                    sortir = true;
                    break;
                default:
                    System.out.println("Opció incorrecta");
                    break;
            }

        }


    }


    public int opcio(){
        Scanner sc = new Scanner(System.in);
        int sortida= sc.nextInt();
        return sortida;
    }


    public void pintaMenu(){
        System.out.println("1- Afegir jugador");
        System.out.println("2- Eliminar jugador");
        System.out.println("3- Reset partida");
        System.out.println("4- Mostrar jugadors");
        System.out.println("5- Sortir");
    }


    public void mostrarJugadors(){

        for (Player p: llista) {
            p.toString();
        }
    }


    public void resetPartida(){

        llista.clear();
    }


    public void eliminarJugador(){

        llista.remove(llista.size() - 1);

    }


    public void  afegirNouJugador(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Escriu nom jugador: ");
        String nom = sc.nextLine();
        System.out.print("Escriu coodenada X:");
        int x = sc.nextInt();
        System.out.print("Escriu coodenada Y:");
        int y = sc.nextInt();

        Position pp = new Position(x,y);
        Player p = new Player(pp,nom);
        llista.add(p);
    }


}
