

    public class MissingNumber {
        public static void main(String[] args) {
            int n = 5; // Example value, set as needed
            int arr[] = {1, 2, 3, 5}; // Example array, set as needed
            MissingNumber mn = new MissingNumber();
            int missing = mn.missingNumberInArray(n, arr);
            System.out.println("Missing number is: " + missing);
        }

        int missingNumberInArray(int n, int[] arr) {
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
            }
            return ((n * (n + 1)) / 2) - sum;
        }
    }


