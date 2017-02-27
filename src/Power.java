/**
 * Created by Serbanescu on 26.02.2017.
 */
public class Power {
    public static void main(String[] args) {
        int x = SkeletonJava.readIntConsole("se da numarul: ");
        int a  = SkeletonJava.readIntConsole("se ridica la puterea: ");

      int pow;
      int counter = 1;
      while(counter<=a){
          pow = x + x;
          System.out.println(pow);
      }

      /*  for(i=0; i<=a; i++)
        { if(pow = x*x) ;
            }
        return (pow);*/

    }
}
