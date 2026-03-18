import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        for (int i = 0 ; i < cnt ; i++) {
            int chk = 0,sum = 0;
            int num = sc.nextInt();
            int arr[] = new int[num];
            for (int j = 0 ; j < num ; j++) {
                int k = sc.nextInt();
                arr[j] = k;
                sum += k;
            }
            double avg = (double)sum/num;
            for (int j = 0 ; j < num ; j++) {
                if (arr[j] > avg) chk ++;
            }
            double percentage = (double)chk/num;
            percentage*= 100;
            System.out.printf("%.3f%%\n", percentage);
        }
    }
}