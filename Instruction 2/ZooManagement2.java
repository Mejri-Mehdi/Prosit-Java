import java.util.Scanner;

class ZooManagement2 {
    public static void main (String [] args) {

        int nbrCages ; 
        String zooName ;
        String Nmbcagecasspesifique ;

        Scanner scanbot = new Scanner (System.in);

        do { 
                System.out.print("Please, put a valid Zoo Name");
                zooName = scanbot.nextLine() ;

                if (zooName.isEmpty()) {
                    System.out.println("THE ZOO NAME can't be EMPTY , Please put a valid Name");
                }

            else {
                    System.out.println(zooName + " is a very Nice name !!");
            }

        } while (zooName.isEmpty());




                do { 
        System.out.println("Now please, put a valid cage Number");
        nbrCages = scanbot.nextInt() ;
                Nmbcagecasspesifique = (nbrCages == 1 || nbrCages == -1 ) ? " Cage" : " Cages" ;

                if (nbrCages <= 0) {
                    System.out.println("What? " + nbrCages + Nmbcagecasspesifique + ", Are you Serious ?");

                }

            else {
                    System.out.println(nbrCages + Nmbcagecasspesifique + " ! Okay, Fantastic");
            }

        } while (nbrCages <= 0);
        
        
        System.out.println(zooName + " comporte " + nbrCages + " " + Nmbcagecasspesifique);
        System.out.println("Bye Bye !");





        

    

    }
}