import java.util.*;
public class Bit_plus_plus {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String[] val = new String[n];
    sc.nextLine(); // consume the newlint(enter key)
    for(int i=0; i<n ; i++){
        val[i] = sc.nextLine();

    }
    int ans = 0;
   for(String x : val){
       if(x.charAt(1) == '-')
       {
           ans--;
       }
       else if(x.charAt(1) == '+'){
           ans++;   
       }
   }
    System.out.println(ans);
}
}



