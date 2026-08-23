import java.util.*;

public class delete {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int val = sc.nextInt();
        int size = sc.nextInt();

        int num[] = new int[size];

        for (int i = 0; i < size; i++) {
            num[i] = sc.nextInt();
        }

        int k = 0;

        for (int i = 0; i < num.length; i++) {

            if (num[i] != val) {

                num[k] = num[i];
                k++;
            }
        }

        System.out.println("Remaining elements:");

        for (int i = 0; i < k; i++) {
            System.out.print(num[i] + " ");
        }

        System.out.println("\nCount = " + k);
    }
}