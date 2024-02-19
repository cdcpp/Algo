import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int arrLength = sc.nextInt();
        int stan = sc.nextInt();
        int [] arr = new int[arrLength];

        int start = 0;
        int end = arrLength -1;

        int count = 0;

        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        while(start < end){
            if(arr[start] + arr[end] < stan){
                start++;
            }else if(arr[start] + arr[end] > stan){
                end--;
            }else{
                count++;
                start++;
                end--;
            }
        }

        System.out.println(count);

    }//main

}
