
    public class SecondLargest {
        public static int SecondLargestElement(int arr[], int n) {
            if (n < 2) {
                return -1; // Not enough elements to have a second largest
            }

            int first = Integer.MIN_VALUE;
            int second = Integer.MIN_VALUE;

            for (int i = 0; i < n; i++) {
                if (arr[i] > first) {
                    second = first;
                    first = arr[i];
                } else if (arr[i] > second && arr[i] != first) {
                    second = arr[i];
                }
            }

            return (second == Integer.MIN_VALUE) ? -1 : second;
        }

        public static void main(String[] args) {
            int[] arr1 = {12, 35, 1, 10, 34, 1};
            int n1 = 6;
            System.out.println(SecondLargestElement(arr1, n1)); // Output: 34

        }
    }
