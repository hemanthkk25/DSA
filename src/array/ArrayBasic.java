package array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayBasic {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int len = in.nextInt();
        int[] arr = new int[len];

        for (int i = 0; i < len; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(arr));
    }
}
