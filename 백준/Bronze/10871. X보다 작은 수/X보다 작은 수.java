import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[sc.nextInt()];
        int check = sc.nextInt();
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            if(check > arr[i]){
                System.out.print(arr[i]+" ");
            }
        }


    }
}
