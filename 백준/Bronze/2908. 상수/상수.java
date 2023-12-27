import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.next());
        StringBuilder sb2 = new StringBuilder(sc.next());
        String a = sb.reverse().toString();
        String b = sb2.reverse().toString();

        if(Integer.parseInt(a) > Integer.parseInt(b)){
            System.out.println(a);
        }else{
            System.out.println(b);
        }



    }//main
}