import java.util.*;

public class circle {

    public static void circle(int a) {
        double cir = 2 * (22.0 / 7 * a);
        System.out.println(cir);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        circle(a);
    }
}
