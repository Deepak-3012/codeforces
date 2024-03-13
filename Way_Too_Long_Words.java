import java.util.*;
public class Way_Too_Long_Words {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // only reads the integer and not newline(enter)
        String [] words = new String[n+1]; // +1 to read the new line from previous input
        for(int i = 0; i<n+1; i++){
            words[i] = sc.nextLine();
        }
        for(int i = 0; i<n+1; i++){ // same here, it first reads the newline that left from previous input
            if(words[i].length() <= 10){
                System.out.print(words[i]);

            }
            else{
                System.out.print(words[i].charAt(0));
                System.out.print(words[i].length()-2);
                System.out.print(words[i].charAt(words[i].length()-1));
            }
            System.out.println();
        }
    }


}