/**
 * Created by Serbanescu on 28.02.2017.
 */
public class StringNames {
    public static void main(String[] args) {


        System.out.println("give me a name: ");
        String names;

        do {
            names = SkeletonJava.readStringConsole("");
        } while(!names.equals("Victoria"));

        System.out.println(names);


    }
}
