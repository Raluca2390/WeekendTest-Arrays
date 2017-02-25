/**
 * verify if number is even or odd
 * Created by Serbanescu on 25.02.2017.
 */
public class EvenOdd {
    public static void main(String[] args) {
        int num = SkeletonJava.readIntConsole("user gave number=");


        if(num % 2 == 0)
        {System.out.println("number is even");}
        else {
            System.out.println("number is odd");
        }


    }
}
