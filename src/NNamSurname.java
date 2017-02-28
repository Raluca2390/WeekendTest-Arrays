/**read N first name&surname combination from keyboard; write surname=firts name&length of surname"popescu+victoria7"
 * Created by Serbanescu on 28.02.2017.
 */
public class NNamSurname {
 /*   public static void main(String[] args) {
       // int n = SkeletonJava.readIntConsole("N first n&s");
        System.out.println("nume:");
        String name = SkeletonJava.readStringConsole("") ;
        System.out.println("prenume:");
        String surname = SkeletonJava.readStringConsole((""));

        System.out.println(name+" " +surname);


    }*/

    public static void main(String[] args) {
        int persoane = SkeletonJava.readIntConsole("cate persoane sa fie");
        String[] names = new String[persoane] ;
        String[] surname = new String[persoane];
        String[] dn =new String[persoane];
            for(int i=0; i< persoane; i++){
                 names[i] = SkeletonJava.readStringConsole("nume") ;
                 surname[i] = SkeletonJava.readStringConsole("prenume");
                 dn [i] = SkeletonJava.readStringConsole("data nasterii");
            }
            for(int i=0; i<persoane; i++){
                SkeletonJava.printConsole(names[i] +"+" +surname[i] +names[i].length() +"+" +dn[i]);
            }
    }

}
