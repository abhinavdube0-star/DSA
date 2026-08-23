import java.util.*;

public class conc {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
          int size=sc.nextInt();
          int num[]=new int[size];
          int ans[]=new int[num.length];
          
           for(int i=0; i<size; i++) {
          num[i] = sc.nextInt();
       }
       for (int i = 0; i < num.length; i++) {
               ans[i] = num[i];
}
int c[]=new int[num.length + ans.length];
for(int i=0;i<num.length;i++){
     c[i]=num[i];
}
for(int i=0;i<num.length;i++){
     c[num.length+i]=ans[i];
    }
    
    for(int i=0;i<c.length;i++){
        System.out.println(c[i]+" ");
    }
}
}
