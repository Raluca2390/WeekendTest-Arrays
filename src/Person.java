/**
 * Created by Serbanescu on 28.02.2017.
 */
public class Person {
    //instanta
    static int persoaneCreate = 0;
    private String prenume;
    private String nume;
    private  String datanasterii;
    //idul persoanei
    private int id;




    public Person () {}

    public Person(String nume, String prenume) {
        this.prenume = prenume;//; ne-ar cere string la nume si prenume
        this.nume = nume;
        datanasterii = x;
        persoaneCreate = persoaneCreate +1;
        this.id = persoaneCreate;

    }
    public String getPrenume(){ //metode de citit starea
        return prenume;}  //starea

    public void setPrenume(String prenume){//argument  //metode de updatat starea - toate s eint in cadrul obiectului respectiv
        /////deocamdata sunt null; dupa ce apelez metoda set name
        this.prenume= prenume;//daca scot 'this' string prenume se refera la var primita la arg metodeo mele (setPrenume)
    }

    public void setNume(String nume){
        this.nume = nume;
    }

    public String getName(){//returneaza val coresp numelui meu
        return nume;
    }

    public static void main(String[] args) {
        Person florin = new Person(); //constructor (constr default exista in orice cls ce nu are alt constructor)
        Person maria = new Person(); //obiect
        florin.setNume("ser");
        maria.setNume("glulu");
        florin.setPrenume("raluca");
        florin.setNume("popescu");
    }
}
