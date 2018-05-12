package ex23Projecte;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class test {


    public static void main(String[] args) {


        // Es crea una empresa
        Empresa e1 = new Empresa("La Factoria", "A2345678", 10000000.00);

        Contracte con1 = new Contracte(entraData("09/02/2018"), 40000.00);
        Treballador t1 = new Treballador("345554433A", "Lluis", "Perales Brufau", "brufau@gmail.com", 54564545, entraData("23/02/1977"), con1);

        Aturat a1 = new Aturat("345554433A", "Lluis", "Perales Brufau", "brufau@gmail.com", 6666545, entraData("01/04/2000"), 3000.00);

        Contracte con2 = new Contracte(entraData("23/05/2018"), 50000.00);
        Treballador t2 = new Treballador("33322112V", "Ana", "González Pereira", "ana@gmail.com", 4564545, entraData("21/06/1976"), con2);

        ArrayList<Impost> conjunt = new ArrayList<Impost>();
        conjunt.add(e1);
        conjunt.add(t1);
        conjunt.add(t2);
        conjunt.add(a1);

        for (Impost i:conjunt) {
            System.out.print(i.toString());
            System.out.print(".El impost és: ");
            System.out.println(i.aplicaImpost());
        }
    }


    static public Date entraData(String dd){
        String pattern = "dd/MM/yyyy";
        Date data = null;
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        try {
            data = format.parse(dd);
            return data;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return data;
    }




}
