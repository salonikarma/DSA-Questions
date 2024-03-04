// print the factorial of 10
public class Recursion2 {
    public static int Fact(int n) {
        if (n == 0) {
            return 1;
        }
        int Fnm = Fact(n - 1);
        int Fn = n * Fact(n - 1);
        return Fn;
    }

    public static void main(String args[]) {
        int n = 5;
        System.out.println(Fact(n));
    }
}
