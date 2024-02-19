public class MultilevelInheritence {
     static class Animal{
         void eat(){
             System.out.println("Eating");
         }
     }
     static class Dog extends Animal{
         void bark(){
             System.out.println("Barking");
         }

     }
     static class BabyDog extends Dog{
         void weep(){
             System.out.println("Weeping");
         }
     }
     public static void main(String args[]){
         BabyDog d = new BabyDog();
         d.eat();
         d.bark();
         d.weep();
     }
}
