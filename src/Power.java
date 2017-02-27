/**
 * Created by Serbanescu on 26.02.2017.
 */
public class Power {
    public static void main(String[] args) {
        int x = SkeletonJava.readIntConsole("se da numarul: ");
        int a = SkeletonJava.readIntConsole("se ridica la puterea: ");

        int multip = Multiply(x, a); //apelam metoda
        /*SkeletonJava.printConsole(multip);*/
        System.out.println(multip);


    }


    public static int Multiply(int x, int a ){
        int multi = x ;

        for ( int  counter = 1; counter< a; counter ++ ){
        multi = multi * x;
       /*SkeletonJava.printConsole(multi );*/}

        return multi;


    }

}
