import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String a = sc.next();
       StringBuffer sb = new StringBuffer(a);

       if(a.equals(sb.reverse().toString())){
           System.out.println(1);
       }else{
           System.out.println(0);
       }

    }//main
}
