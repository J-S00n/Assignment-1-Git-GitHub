import java.util.Scanner;
public class math {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This is a program to find the sum of first k elements of an array!\n" + //
                        "");
        System.out.println("Enter the number of elements in your array:");
        int num = input.nextInt();
        int[] arr = new int[num];
        System.out.println("\nEnter the elements in your array:");
        for (int i = 0; i < num; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("\nEnter the value of k");
        int k = input.nextInt();
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        System.out.println("\nThe sum of first " + k + " elements is " + sum +"!");
    }
}