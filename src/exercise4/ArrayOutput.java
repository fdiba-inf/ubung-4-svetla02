package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOutput {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
          arr[i] = input.nextInt();
        }
        for (int i = 0; i < size; i++) {
          for (int j = 0; j < i; j++) {
            System.out.print(" ");
          }
          System.out.println(arr[i]);
        }
    }

}
