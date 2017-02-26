/**
 * Problema numarul 4
 * Created by Serbanescu on 26.02.2017.
 */
public class IntervalNumber {
    public static void main(String[] args) {
        int x = SkeletonJava.readIntConsole("se da numarul: ");
        boolean isThere = true;

        if (x > 8 && x < 25) {
            System.out.println(isThere);
        } else {
            isThere = false;
            System.out.println(isThere);
        }

    }
}
