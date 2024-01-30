import java.util.Scanner;


public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 1;
        int count = 1;
        int sIndex = 1;
        int eIndex = 1;

        while (eIndex < n){

            if(sum == n){
                count ++;
                eIndex++;
                sum += eIndex;
            }else if(sum > n){
                sum -= sIndex;
                sIndex++;
            }else {
                eIndex++;
                 sum += eIndex;

            }


        }
        System.out.println(count);


    }//main

}