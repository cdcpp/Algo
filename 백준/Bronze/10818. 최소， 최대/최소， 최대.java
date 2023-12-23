import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[sc.nextInt()];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(arr[0] + " " + arr[arr.length-1]);


        //for(int i=1;i<arr.length;i++){

        //    for(int j=0;j<arr.length;j++){
        //        if(arr[i] < arr[j]){
        //            int tmp = arr[j];
        //            arr[j] = arr[i];
        //            arr[i] = tmp;
        //        }

        //    }
        }
    }
