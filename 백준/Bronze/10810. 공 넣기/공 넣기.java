import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];
        int forCount = sc.nextInt();
        int count = 0;
        for (int i = 0; i < forCount; i++) {
            int a = sc.nextInt(); //부터
            int b = sc.nextInt(); //까지
            int c = sc.nextInt(); //몇번

            for (int k = a; k <= b; k++) {
                arr[k - 1] = c;
            }


        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}//main