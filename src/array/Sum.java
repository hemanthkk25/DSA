package array;
import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        int sum = 0;

        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }

        for (int i = 0; i < n; i++){
            sum += arr[i];
        }

        System.out.println(sum);

    }
}