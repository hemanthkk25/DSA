package array;
import java.util.*;
public class CntofODD {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int n = inp.nextInt();
        int[] arr = new int[n];
        int cnt = 0;

        for(int i = 0; i < n; i++){
            arr[i] = inp.nextInt();
        }

        for(int i = 0; i < n; i++ ){
           if (arr[i] % 2!=0) {
               cnt += 1;
            }
        }

        System.out.println(cnt);

    }
}
