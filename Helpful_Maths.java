import java.util.*;
public class Helpful_Maths {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    s = s.replace("+","");
    char [] s2 = s.toCharArray();
    // ex input :1+1+2+1
    // output  : 1+1+1+2
    Arrays.sort(s2);
    for(int i = 0; i<s.length(); i++){
        System.out.print(s2[i]);
        if(i == s2.length-1)
            continue;
        System.out.print("+");
    }
    System.out.println();
}
}
