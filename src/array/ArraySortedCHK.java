package array;
import java.util.*;
public class ArraySortedCHK {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int[] arr = new int[n];
        char sts = 'T';
        for (int i = 0; i < n; i++){
            arr[i] = inp.nextInt();
        }

        for (int i = 0; i < n-1; i++){
            if (arr[i] > arr[i+1]){
                sts = 'F';
                break;
            }
        }

        if (sts=='F'){
            System.out.println("Unsorted");
        }
        else{
            System.out.println("Sorted");
        }

    }
}
