package basics;

public class ArrayBasic2 {

    // This is utility method to print the array
    static void printArray(int[] arr){
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    // 1. Method to Reverse the array(Two pointer)
    static void reverseArray(int[] arr) {
        int left = 0, right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    // 2. Count Occurance of an Element
    static int countFrequency(int[] arr, int target) {
        int count = 0;
        for (int x : arr) {
            if (x == target) count++;
        }
        return count;
    }

    // 3. Check if the array is Sorted
    static boolean isSorted(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }
    

    // 4. Find Second Largest Element
    static int secondLargest(int[] arr) {
        int max = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int x : arr) {
            if (x > max) {
                second = max;
                max = x;
            } else if (x > second && x != max) {
                second = x;
            }
        }
        return second;
    }

    // 5. Rotate Array Left By One
    static void rotateLeftByOne(int[] arr) {
        int first = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = first;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 2};

        System.out.print("Original Array: ");
        printArray(arr);

        // Reverse
        reverseArray(arr);
        System.out.print("Reverse Array: ");
        printArray(arr);

        // Frequency 
        System.out.println("Frequency of 2: " + countFrequency(arr, 3));

        //Sorted Check
        System.out.println("Is Sorted: " + isSorted(arr));

        // Second Largest
        System.out.println("Second largest: " + secondLargest(arr));

        // Rotate Left By One
        rotateLeftByOne(arr);
        System.out.print("After Left Rotation: ");
        printArray(arr);

    }
}