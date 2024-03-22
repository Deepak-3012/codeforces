import java.util.*;
public class Beautiful_Matrix {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
//        int row = sc.nextInt();
//        int col = sc.nextInt();
        int [][] arr = new int[5][5];
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                arr[i][j] = sc.nextInt();
            }
        }
       for(int i=0; i<5; i++){
           for(int j=0; j<5; j++){
               if(arr[i][j] != 0){
                   System.out.println(Math.abs(3-(i+1)) + Math.abs(3-(j+1)));
                   break;
               }
           }
       }
    }
    }

