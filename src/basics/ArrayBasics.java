package basics;

public class ArrayBasics {

    // Method to print the array
    static void printArray(int[] arr) {
        for(int a = 0; a < arr.length; a++) {
            System.out.print(arr[a] + " ");
        }
        System.out.println();
    }

    // Method to find the sum of array
    static int sumArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }

    // Method to find the max element
    static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // Method to find the minimum element 
    static int fintMin(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[0] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        // 1. Array Declaration 
        int[] arr = {10, 20, 30, 40, 50};

        // 2. Print array
        System.out.println("Array element: ");
        printArray(arr);    

        // 3. Length of array
        System.out.println("Array length: " + arr.length);

        // 4. Accessing the element 
        System.out.println("First element: " + arr[0]);
        System.out.println("Last element: " + arr[arr.length - 1]);

        // 5. Sum of array
        System.out.println("Sum of array: " + sumArray(arr));

        // 6. Maximum Element 
        System.out.println("Maximum element: " + findMax(arr) );

        // 7. Minimum Element
        System.out.println("Minimum Element: " + fintMin(arr));
    }
}
