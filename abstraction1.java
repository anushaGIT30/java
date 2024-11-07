//using interfaces
//we are unable to use constructors in interface

interface Animals {
    int eyes = 2;// it is static for others also

    public void eating();// we can also remove the public or abstract becoz it is public by default
}

// creating multiple inheritance
interface herbivorus {

}

class horse implements Animals, herbivorus { // this is the multiple inheritance
    public void eating() {
        System.out.println("the animal is eating");
    }
}

public class abstraction1 {

}
// properties of interface
/*
 * 1.by default all the fields in the interface are public, static,final by
 * default
 * 2.all methods are public and abstract by default
 * 3.****the interfaces support the functionality of multiple inheritance
 */