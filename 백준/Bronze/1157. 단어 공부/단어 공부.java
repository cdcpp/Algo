
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String check = sc.next().toUpperCase();

       int countArr[] = new int[26];
       int count = 0;
       char result = '?';

       for(int i=0;i<check.length();i++){
           countArr[check.charAt(i) - 65]++;

           if(count < countArr[check.charAt(i) - 65]){
               count = countArr[check.charAt(i) - 65];
               result = check.charAt(i);
           }else if(count == countArr[check.charAt(i) - 65]){
               result = '?';
           }
       }
        System.out.println(result);
    }//main

}