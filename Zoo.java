

public  class Zoo {
    Animal [] animals ;
    String name ;
    String city ;
    final int NBR_CAGES = 25 ;
    int animalCount;

            public Zoo (String name,  String city) {
            this.name = name ;
            this.city = city ;
            this.animals = new Animal[NBR_CAGES] ;
            this.animalCount = 0 ;

        }

        public void displayZoo(){
            System.out.println( name + " " + city + " " + NBR_CAGES );
        }



        public String toString() {
            return  "Zoo name: " + name + ", city: " + city + ", number of cages: " + NBR_CAGES;

        }

        public void displayZooAnimals () {
        for (Animal a : animals) {
            if (a != null) {
            System.out.println(a);

            }

        }
    }

            public boolean addAnimal(Animal animal) {

                    for (Animal a : animals) {
                        if (a != null && a.name.equals(animal.name) && a.family.equals(animal.family) && a.age == animal.age  && a.isMammal == animal.isMammal) {
                            System.out.println("you already have this animal");
                            return false;
        }
    }

                if ( animalCount > NBR_CAGES ) {
                    System.out.println("vous avez depasser la limite de cages");
                    return false;
                }


                if ( animalCount == NBR_CAGES ) {
                    System.out.println("vous avez atteint la limite de cages");
                    return false;
                }


                for ( Animal a : animals) {


            }
            
            animals[animalCount] = animal;
            animalCount++;
            return true; 
                
    
            }

     public int searchAnimal(Animal animal) {
        for (int i = 0; i < NBR_CAGES; i++) {
            if  (animals [i] != null &&  animals[i].name.equals(animal.name) ) {
            return  i ;
            }
        }
        return -1 ;
    }


    public boolean removeAnimal(Animal animal) {
        
        for (int i = 0 ; i < NBR_CAGES ; i ++) {
            if (animals[i].name.equals(animal.name) ) {
            animals[i] = null ;
            System.out.println("Animal removed successfully");
            animalCount -- ;
            return true ;

            }
            }
    
        System.out.println("You don't have this Animal");
        return false ;
    }


    public boolean isZooFull() {
        boolean full = animalCount >= NBR_CAGES;
        System.out.println(full ? "Zoo is full" : "Zoo is not full");
        return full ;

    }


    public Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.animalCount == z2.animalCount) {
            System.out.println(z1 + " and " + z2 + " have the exact number of animals");
            return null ;
        }
        else
        if (z1.animalCount > z2.animalCount) {
        System.out.println(z1 + " have more animals than " + z2);
        return z1;
        }
        else {
        System.out.println(z2 + " have more animals than " + z1);
        return z2;

        }


    }

} 