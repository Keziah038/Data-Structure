import java.util.Scanner;

public class NumberAnalysis {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        // Input 5 numbers from the user
        System.out.println("Enter 5 different numbers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
        }

        // Sort the array
        bubbleSort(numbers);

        // Display sorted array
        System.out.print("Sorted array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Find second smallest and second largest
        int secondSmallest = findSecondSmallest(numbers);
        int secondLargest = findSecondLargest(numbers);

        System.out.println("Second Smallest Number: " + secondSmallest);
        System.out.println("Second Largest Number: " + secondLargest);

        sc.close();
    }

    // Bubble Sort method
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Method to find second smallest number
    public static int findSecondSmallest(int[] arr) {
        int smallest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != smallest) {
                return arr[i]; // since array is sorted
            }
        }
        return -1; // in case all elements are same
    }

    // Method to find second largest number
    public static int findSecondLargest(int[] arr) {
        int largest = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] != largest) {
                return arr[i]; // second last different value
            }
        }
        return -1;
    }
}