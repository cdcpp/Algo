
import java.util.Scanner;


public class Main {
    public static void main(String[] args)  {
       Scanner sc = new Scanner(System.in);

       int sum = 0;
       for(int i=0;i<5;i++){

           int a = sc.nextInt();
           if(40 > a){
               a = 40;
           }
           sum += a;

       }

        System.out.println(sum/5);
    }

}
