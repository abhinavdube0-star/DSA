import java.util.*;

public class dupli {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int target = sc.nextInt();
        int size = sc.nextInt();

        int nums[] = new int[size];

        // Array input
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        // Two Sum
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] + nums[j] == target) {
                    System.out.println(nums[i] + " " + nums[j]);
                }
            }
        }
    }
}