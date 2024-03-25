import java.util.*;
public class Boy_or_Girl {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String inp = sc.next();
    HashSet<Character> hs = new HashSet<>();
    for(int i = 0; i<inp.length(); i++){
        hs.add(inp.charAt(i));
    }
    if(hs.size() % 2 == 0){
        System.out.println("CHAT WITH HER!");
    }
    else{
        System.out.println("IGNORE HIM!");
    }
}
}
