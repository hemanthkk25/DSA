package array;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }

        int tar = in.nextInt();

        for (int i = 0; i < n; i++){
            if (arr[i]==tar){
                System.out.println("Found at: "+i);
                break;
            }

            else if (i==n-1){
                System.out.println("Not found in the list");
            }
        }
    }
}
