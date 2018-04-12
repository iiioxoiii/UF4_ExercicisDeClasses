package ex11FerriesCamions;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class gestioFerryCamio {


    public static void main(String[] args) {
        gestioFerryCamio programa = new gestioFerryCamio();
        programa.go();
    }


    public void go(){

        Controller control = new ControllerImpl();

        control.configuraFerry();

        boolean sortir = false;

        while(!sortir){
            control.preguntesMenu();
            Integer op = control.preguntaInteger();
            if(op.equals(1)){
                control.mostraPesCamions();
            }else if (op.equals(2)){
                control.determinaCamioEmbarcat();
            }else if (op.equals(3)){
                control.determinaCamioPotEntrar();
            }else if (op.equals(4)){
                control.embarcarUnCamio();
            }else if (op.equals(5)){
                control.determinaNumCamionsEmbarcats();
            }else if (op.equals(6)) {
                control.determinaPeatgeCamio();
            }else if (op.equals(7)) {
                control.determinaCamioNumero();
            }else if (op.equals(9)){
                sortir = true;
            }

        }

        System.out.println("by");

    }

}
