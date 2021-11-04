package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class MinIndex {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        float[] arr = new float[n];
        float min = 100;
        int ind = 0;
        
        for (int i = 0; i < n; i++) {
          arr[i] = input.nextInt();
          if (min > arr[i]) {
            min = arr[i];
            ind = i;
      
          }
        }
        System.out.println("Min index: " + ind);
    }
}

