/**
 * Created by Serbanescu on 27.02.2017.
 */
public class Factorial6 {
    public static void main(String[] args) {
        int a = SkeletonJava.readIntConsole("numarul a este: ");
        int b = 1;

        int factorial = Factorial1(a, b);

        System.out.println(factorial);
    }

    public static int Factorial1(int a, int b) {
        int f = b;

        for (int i = 1; i <= a; i++) {
            f = f * i;

        }
        return (f);
    }


}








