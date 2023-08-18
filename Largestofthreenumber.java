public class Largestofthreenumber {
    public static void main(String args[]){
        int A = 2;
        int B = 13;
        int C = 7;

        if((A>=B) && (A>=C)){
            System.out.println("A is largest number");
        }
        else if(B>=C){
            System.out.println("B is largest number");
        }
        else{
            System.out.println("C is largest number");
        }
    }
}
