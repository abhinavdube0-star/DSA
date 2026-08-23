import java.util.*;

public class Sum {

    public static int sumprint(int n, int sum) {

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            }
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int sum = 0;

        int result = sumprint(n, sum);

        System.out.println(result);
    }
}