public class Abstraction2 {
    public static void main(String args[]){
        Horse1 h = new Horse1();
        h.eat();
        h.walk();

        System.out.println(h.color);

    }
}
abstract class Animal1{
    String color;
    Animal1(){
        color ="Brown";

    }
    void eat(){
        System.out.println("Animal eats");
    }
    abstract void walk(); // ye method abstract isliye hai kyuki iska implementation nhi hai isme
}

class Horse1 extends Animal1{
    void changeColor(){
        color = "Dark brown";
    }
    void walk(){
        System.out.println("walks on 4 legs");
    }
}
class chicken1 extends Animal1{
    void changeColor(){
        color ="yellow";
    }
    void walk(){
        System.out.println("walks on 2 legs");
    }
}


