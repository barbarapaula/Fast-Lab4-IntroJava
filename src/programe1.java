/**
 * Created by andrea on 18/03/2017.
 */
public class programe1 {
    public static void main(String[] args) {

        int numar;
        numar=SkeletonJava.readIntConsole("Introduceti un numar");

        if(numar>=0){
            // aici voi calcula si afisa patratul sau
            int patrat = numar*numar;
            SkeletonJava.printConsole("Aici este patratul: "+patrat);
        }
        else{
            // aici voi afisa numarul pe care l-am citit
            SkeletonJava.printConsole("Aici este numarul: "+numar);

            System.out.println(1*numar);
            System.out.println(2*numar);
            System.out.println(3*numar);

        }
    }
}
