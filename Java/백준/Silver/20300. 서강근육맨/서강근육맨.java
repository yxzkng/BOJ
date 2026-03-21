import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] arr = new long[N];
        long max = 0;
        for (int i = 0 ; i < N ; i++) {
            arr[i] = sc.nextLong();
        }
        Arrays.sort(arr);

        if (N%2 == 0) {
            for(int i = 0 ; i < N/2 ; i++) {
                long temp = arr[i] + arr[N-1-i];
                if (temp > max) max = temp;
            }
        }
        else {
            max= arr[N-1];
            for(int i = 0 ; i < (N-1)/2 ; i++) {
                long temp = arr[i] + arr[N-2-i];
                if (temp > max) max = temp;
            }
        }
        System.out.println(max);
    }
}