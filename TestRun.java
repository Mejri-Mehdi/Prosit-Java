public class TestRun {
    public static void main (String [] args) {


        Animal lion = new Animal ("Felidae", "Lion", 5, true);
        Animal elephant = new Animal("Elephantidae", "Éléphant", 10, true);
        Animal crocodile = new Animal("Crocodylidae", "Crocodile", 7, false);



        Zoo myZoo = new Zoo ("Safari Park", "Tunis", 20) ;

        myZoo.animals[0] = lion;
        myZoo.animals[1] = elephant;
        myZoo.animals[2] = crocodile;


        myZoo.displayZoo();

        System.out.println(myZoo);
        System.out.println(myZoo.toString());


        for ( Animal a : myZoo.animals ) {
            if (a!= null) {
                System.out.println(a.toString());
            }

        }

    }
}