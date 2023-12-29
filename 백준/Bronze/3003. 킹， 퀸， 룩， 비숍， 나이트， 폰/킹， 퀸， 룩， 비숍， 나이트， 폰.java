
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int arr[] = new int[6];

       for(int i=0;i<arr.length;i++){
           arr[i] = sc.nextInt();
       }

       for(int i=0;i<arr.length;i++){
           switch (i) {
               case 0: arr[0] = 1 - arr[0]; break;
               case 1: arr[1] = 1 - arr[1]; break;
               case 2: arr[2] = 2 - arr[2]; break;
               case 3: arr[3] = 2 - arr[3]; break;
               case 4: arr[4] = 2 - arr[4]; break;
               case 5: arr[5] = 8 - arr[5]; break;
           }
       }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }




    }//main
}
