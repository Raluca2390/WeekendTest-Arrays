/**
 * Created by Serbanescu on 26.02.2017.
 */
public class PrimeNumber {
    public static void main(String[] args) {
        int x = SkeletonJava.readIntConsole("give a number from keyboard");
        int i ;
        double temp;

        for(i=2; i<=x/2; i ++)
        {    temp = x % i;
            if(temp == 1)
            System.out.println(x + "Number is prime");
        else
        System.out.println(x + "number is not prime");
        }
    }
}
