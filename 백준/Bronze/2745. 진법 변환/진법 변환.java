import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        int divnum = sc.nextInt();

        long a = 0;
        int sum = 0;
        int xo = 1;


        for(int i=num.length()-1;i>=0;i--){
            char c = num.charAt(i);
            if('A' <= c && c <= 'Z' ){
                sum += (c - 'A' + 10 ) * xo;
            }else{
                sum += (c - '0') * xo;
            }
            xo *= divnum;
        }
        System.out.println(sum);




    }

}