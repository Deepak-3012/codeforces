import java.util.*;
public class Petya_and_Strings {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s1 = sc.nextLine();
    String s2 = sc.nextLine();

    int res = 0;
    for(int i = 0 ; i<s1.length() ; i++){
        if(s1.toLowerCase().charAt(i) == s2.toLowerCase().charAt(i)){
            continue;
        }
      else if(s1.toLowerCase().charAt(i) < s2.toLowerCase().charAt(i)){
          res = -1;
          break;
      }
      else if(s1.toLowerCase().charAt(i) > s2.toLowerCase().charAt(i)){
          res = 1;
          break;
        }
    }
    System.out.println(res);
}
}
