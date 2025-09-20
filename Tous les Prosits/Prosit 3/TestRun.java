

public class TestRun {
    public static void main (String [] args) {


        Animal lion = new Animal ("Felidae", "Lion", 5, true);
        Animal lion2 = new Animal ("Felidae", "Lion", 5, true);
        Animal elephant = new Animal("Elephantidae", "Éléphant", 10, true);
        Animal elephant2 = new Animal("Elephantidae", "Éléphant", 10, true);
        Animal crocodile = new Animal("Crocodylidae", "Crocodile", 7, false);



        Zoo myZoo = new Zoo ("Safari Park", "Tunis") ;
        Zoo myZoo2 = new Zoo ("Da7da7", "Tunis") ;

        System.out.println(myZoo.toString());
        System.out.println(myZoo2.toString());

        myZoo.addAnimal(lion) ;
        myZoo.addAnimal(elephant) ;
        myZoo.addAnimal(crocodile) ;

        myZoo2.addAnimal(lion) ;

        for (int i = 3; i < 25; i++) {

        myZoo.addAnimal(new Animal("TestFamily", "Animal" + i, i, true));

        }

        //myZoo.displayZoo();
        
        System.out.println("The First Zoo has this animals list : ");
        myZoo.displayZooAnimals();


        System.out.println("can i add this animal in zoo one : " + myZoo.addAnimal(lion2));
        System.out.println("can i add this animal in zoo one  : " + myZoo.addAnimal(elephant2));
        System.out.println("can i add this animal in zoo one  : " + myZoo.addAnimal(lion));

        
        System.out.println("can i add an extra animal ?, if yes print true if no print false : " + myZoo.addAnimal(new Animal("does is fit ? ", "Extra Animal" , 2 , true)));
        
        System.out.println("what is this animal position in zoo one  :" + myZoo.searchAnimal(lion));
        System.out.println("what is this animal position in zoo one  :" + myZoo.searchAnimal(elephant));
        System.out.println("what is this animal position in zoo one  :" + myZoo.searchAnimal(elephant2));


        myZoo.removeAnimal(lion); 
        System.out.println("what is this animal position in zoo one  :" + myZoo.searchAnimal(lion));
        System.out.println("what is this animal position in zoo one  :" + myZoo.searchAnimal(lion));
        System.out.println("what is this animal position in zoo one  :" + myZoo.searchAnimal(elephant));


        myZoo.isZooFull() ;



        System.out.println("The Second Zoo has this animals list : ");
        myZoo2.displayZooAnimals();

        System.out.println("after conparing the zoo 1 and zoo 2, we find out that");
        myZoo.comparerZoo(myZoo,myZoo2) ;
        

    

    }
}