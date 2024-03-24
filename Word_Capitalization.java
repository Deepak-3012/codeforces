import java.util.*;
public class Word_Capitalization {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    // In java string is immutable so i am converting string to character array
    String s1 = sc.next();
    char [] arr = s1.toCharArray();
     arr[0] = Character.toUpperCase(arr[0]);
     for(int i = 0 ; i<s1.length(); i++){
         System.out.print(arr[i]);
     }
    System.out.println();

}
}
