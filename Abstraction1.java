public class Abstraction1 {
    public static void main(String args[]){
        Horse h = new Horse();
        h.eat();
        h.walk();

        chicken c = new chicken();
        c.eat();
        c.walk();

    }
}
abstract class Animal{
    void eat(){
        System.out.println("Animal eats");
    }
    abstract void walk(); // ye method abstract isliye hai kyuki iska implementation nhi hai isme
}

class Horse extends Animal{
    void walk(){
        System.out.println("walks on 4 legs");
    }
}
class chicken extends Animal{
    void walk(){
        System.out.println("walks on 2 legs");
    }
}
