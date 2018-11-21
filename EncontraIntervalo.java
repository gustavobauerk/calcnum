/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encontraintervalo;

import static java.lang.Math.pow;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gustavo
 */
public class EncontraIntervalo {

    static List<Double> intervalos = new ArrayList<>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double anterior = 0D;
        for (double i = -1000; i < 1000; i++) {
            double a = f(i);
            if (a > 0 && anterior < 0) {
                intervalos.add(i - 1);
                intervalos.add(i);
                intervalos.add(null);
            } else if (a < 0 && anterior > 0) {
                intervalos.add(i - 1);
                intervalos.add(i);
                intervalos.add(null);
            } else if (a == 0) {
                intervalos.add(i);
                intervalos.add(null);
            }
            anterior = a;
        }
        for (Double d : intervalos) {
            if (d != null) {
                System.out.print(d + "\n");
            }
        }
    }

    private static double f(double x) {
        return (Double) (5D * x) + pow(x, 3) - 4 - pow(x, 2) + Math.E;
    }

}
