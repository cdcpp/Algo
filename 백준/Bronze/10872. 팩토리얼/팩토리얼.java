import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int score = n;

       for(int i=n-1;i>=1;i--){
            score *= i;
       }
       if(score == 0){
           score = 1;
       }
        System.out.println(score);
    }//main
}
