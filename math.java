import java.util.Scanner;

public class math {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int num, k, check, sum = 0;
            // Asking the user for the number of elements in the array
            System.out.println("This is a program to find the sum of first k elements of an array!\n");
            while (true) {
                System.out.println("Enter the number of elements in your array:");
                try {
                    num = Integer.parseInt(input.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Please enter an integer value!");
                }
            }
            // Creating an array of size num
            int[] arr = new int[num];
            // Asking the user for the elements of the array
            System.out.println("\nEnter the elements in your array (No Spaces):");
            for (int i = 0; i < num; i++) {
                while (true) {
                    try {
                        check = Integer.parseInt(input.nextLine());
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Please enter an integer value!");
                    }
                }
                arr[i] = check;
            }
            // Asking the user for the value of k
            while (true) {
                System.out.println("\nEnter the value of k");
                try {
                    k = Integer.parseInt(input.nextLine());
                    while (k > num) {
                        System.out.println(
                                "Please enter a value of k less than or equal to the number of elements in the array!");
                        k = Integer.parseInt(input.nextLine());
                    }
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Please enter an integer value!");
                }
            }
            // Calculating the sum of first k elements
            for (int i = 0; i < k; i++) {
                sum += arr[i];
            }
            //Using format string
            System.out.printf("\nThe sum of first %d elements is %d%n!", k, sum);
        }
    }
}