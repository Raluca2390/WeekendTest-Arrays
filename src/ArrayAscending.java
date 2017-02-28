/**
 * Created by Serbanescu on 28.02.2017.
 */
public class ArrayAscending {
    public static void main(String[] args) {
        int temp;
        int n = SkeletonJava.readIntConsole("string contains n numbers: ");
        int sir[] = new int[n];
        System.out.println("Enter all the elements:");

        for (int i = 0; i <= n; i++) {
            sir[i] = n;

        }

        for (int i = 0; i <= n; i++){
            for (int j = i+1; j<n ; j++ ){
                if (sir[i]<sir[j]){
                    { temp =sir[i];
                      sir[i]=sir[j];
                      sir[j] = temp;
                    }
                                    }

                                        }

                                    }

        System.out.print("Ascending Order:");
        for (int i = 0; i < n - 1; i++)
        {
            System.out.println(sir[i] + ",");
        }
        System.out.println(sir[n - 1]);
} }

