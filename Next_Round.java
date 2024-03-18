import java.util.*;
public class Next_Round {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int [] part = new int[n];
        for(int i = 0; i<n; i++){
            part[i] = sc.nextInt();
        }
        int count = 0;

        for(int i = 0; i<n; i++){
            if(part[i] >= part[k-1] && part[i] > 0) {
                count++;
            }
        }
        System.out.println(count);

    }
}
