/**
 * Created by Serbanescu on 28.02.2017.
 */
public class ArraysOddDouble {
    public static void main(String[] args) {
        int[] a= {1,5,4,6,12,13};
        int[] output = new int[a.length];

        for(int i=0; i< a.length; i++) {
            if (a[i] % 2 == 0) {
                output[i] = 2 * a[i];
            } else {
                output[i] = a[i] * a[i];
            }
        }
       for(int i=0; i<output.length;i++){
           System.out.println(output[i]);
        }

    }
}
