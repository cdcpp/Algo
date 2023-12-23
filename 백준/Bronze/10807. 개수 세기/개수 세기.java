
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int arr[] = new int[count];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int check = sc.nextInt();
        int c = 0;

        for(int i=0;i<arr.length;i++){
           if(arr[i] == check){
               c++;
           }
        }

        System.out.println(c);
    }
}
