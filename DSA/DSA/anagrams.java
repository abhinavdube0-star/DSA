import java.util.*;
public class anagrams {
    public static void main(String[] args) {
        Scanner.sc=new Scanner(System.in);
        int size=sc.nextInt();
        String num=new String(size);

        for (int i = 0; i < num.length; i++) {
            for(int j =1;j<num.length;i++){
                if (num[i.length]!=num[j.length]) {
                    return false
                }
            
            }
        }

        
    }
}
