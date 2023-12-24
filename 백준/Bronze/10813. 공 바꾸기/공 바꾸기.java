import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];
        int forCount = sc.nextInt();
        int count = 0;
        int k = 1;
        for(int i=0;i< arr.length;i++){
            arr[i] += k;
            k++;
        }


        for (int i = 0; i < forCount; i++) {
            int a = sc.nextInt(); //몇번
            int b = sc.nextInt(); //몇번

            int tmp = arr[a-1];
            arr[a-1] = arr[b-1];
            arr[b-1] = tmp;



        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}//main
