
public class LagrangePolynomial {

    public static void main(String[] args) {
        //Declaration of variables
        int n = 3; //Number of terms
        int count, count2; //Loop variables, for counting loops

        float[] arrayx = {1f, 2f, 3f};

        float[] arrayy = {1f, 2f, 3f};
        float x = 3;
        float y = 0; //The corresponding value, f(x)=y
        float numerator; //The numerator
        float denominator;  //The denominator

        //first Loop for the polynomial calculation
        for (count = 0; count < n; count++) {
            //Initialisation of variable
            numerator = 1;
            denominator = 1;

            //second Loop for the polynomial calculation
            for (count2 = 0; count2 < n; count2++) {
                if (count2 != count) {
                    numerator = numerator * (x - arrayx[count2]);
                    denominator = denominator * (arrayx[count] - arrayx[count2]);
                }
            }
            y = y + (numerator / denominator) * arrayy[count];
        }
        System.out.println("When x = " + x + "," + " y = " + y);
    }
}
