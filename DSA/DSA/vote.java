import java.util.*;

public class vote {
    public static void vote(int a){
        if (a>18) {
            System.out.println("yes you vote now");
            
        }
        else{
            System.out.println("no you are underage");

        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        vote(a);
    }
    
}
