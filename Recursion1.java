//print the sum of n natural number
public class Recursion1 {
    public static int calSum(int n){
        if(n==1){
            return 1;
        }
        int Snm = calSum(n-1); //sab se pehle n-1 ka sum calculate krenge
        int Sn = n+Snm;
        return Sn;
    }
    public static void main(String args[]){
        int n = 5;
        System.out.println(calSum(n));
    }

}
