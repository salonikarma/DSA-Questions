import java.util.*;
//add two numbers and return the sum
public class Function2 {
    public static void calculatesum(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("sum is : " +sum);
    }
    public static void main(String args[]){
        calculatesum();

    }
}
