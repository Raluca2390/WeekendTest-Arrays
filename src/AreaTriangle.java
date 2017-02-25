/**
 * Created by Serbanescu on 25.02.2017.
 */
public class AreaTriangle {
    public static void main(String[] args) {
        double width = SkeletonJava.readDoubleConsole("width: ");
        double height = SkeletonJava.readDoubleConsole("height: ");

        double area = (width * height) / 2;

        System.out.println("Area of the triangle is: " + area);
    }
}
