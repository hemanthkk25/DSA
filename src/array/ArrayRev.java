package array;

import java.util.*;

public class ArrayRev {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] arr = new int[n];


        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }

        int j = n-1;
        for (int i = 0; i < n/2; i++){
            int t = arr[i];
            arr[i] = arr[j]; // instead of j, n-1-i can be used
            arr[j] = t;
            j--;
        }

        System.out.println(Arrays.toString(arr));

    }
}
