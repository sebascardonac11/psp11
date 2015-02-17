package vista;

import controller.Calculos;
import java.util.LinkedList;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        LOCMethod();
        PgsChapter();
    }

    public static void LOCMethod() {
        System.out.println("LOC/Method");
        LinkedList<Double> x = new LinkedList<Double>();
        x.add(6.0000);
        x.add(6.0000);
        x.add(8.3333);
        x.add(10.3333);
        x.add(12.3333);
        x.add(16.4000);
        x.add(20.5000);
        x.add(21.7500);
        x.add(22.2500);
        x.add(23.0000);
        x.add(28.3333);
        x.add(29.0000);
        x.add(55.8000);

        Calculos cal = new Calculos(x);
        
        System.out.println("VS: " + cal.getVS());
        System.out.println("S : " + cal.getS());
        System.out.println("M : " + cal.getM());
        System.out.println("L : " + cal.getL());
        System.out.println("VL: " + cal.getVL());
        System.out.println("");
    }

    public static void PgsChapter() {
        System.out.println("Pgs/Chapter");
        LinkedList<Double> y = new LinkedList<Double>();
        y.add(7.0);
        y.add(12.0);
        y.add(10.0);
        y.add(10.0);
        y.add(12.0);
        y.add(12.0);
        y.add(12.0);
        y.add(12.0);
        y.add(12.0);
        y.add(8.0);
        y.add(8.0);
        y.add(8.0);
        y.add(20.0);
        y.add(14.0);
        y.add(18.0);
        y.add(12.0);

        Calculos cal = new Calculos(y);

        System.out.println("VS: " + cal.getVS());
        System.out.println("S : " + cal.getS());
        System.out.println("M : " + cal.getM());
        System.out.println("L : " + cal.getL());
        System.out.println("VL: " + cal.getVL());
    }
}
