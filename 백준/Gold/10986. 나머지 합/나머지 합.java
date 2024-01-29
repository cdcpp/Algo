import java.io.IOException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int div = sc.nextInt();

        long [] sumArr = new long[len];
        long [] divArr = new long[div];

        long answer = 0;

        sumArr[0] = sc.nextInt();
        for(int i=1;i<len;i++){
            sumArr[i] = sumArr[i-1] + sc.nextInt();
        }

        for(int i=0;i<len;i++){
            int cc = (int)(sumArr[i] % div);

            if(cc == 0){
                answer ++;
            }
            divArr[cc]++;
        }

        for(int i=0;i<div;i++){
            if(divArr[i] > 1){
                answer = answer + (divArr[i] * (divArr[i]-1) / 2);
            }
        }
        System.out.println(answer);
    }//main

}
