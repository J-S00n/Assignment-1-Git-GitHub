import java.util.Scanner;

public class math {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This is a program to find the sum of first k elements of an array!\n");

        int num;
        int k;
        int check;
        while (true) {
            System.out.println("Enter the number of elements in your array:");
            try {
                num = Integer.parseInt(input.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Please enter an integer value!");
            }
        }
        int[] arr = new int[num];

        System.out.println("\nEnter the elements in your array (No Spaces):");
        for (int i = 0; i < num; i++) {
            while (true) {
                try {
                    check = Integer.parseInt(input.nextLine());
                    break;
                } catch (Exception e) {
                    System.out.println("Please enter an integer value!");
                }
            }
            arr[i] = check;
        }
//k,=num 
        while (true) {
            System.out.println("\nEnter the value of k");
            try {
                k = Integer.parseInt(input.nextLine());
                while (k > num) {
                    System.out.println("Please enter a value of k less than or equal to the number of elements in the array!");
                    k = Integer.parseInt(input.nextLine());
                }
                break;
            } catch (Exception e) {
                System.out.println("Please enter an integer value!");
            }

        }

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        System.out.printf("\nThe sum of first %d elements is %d%n!", k, sum);

        input.close();
    }
}