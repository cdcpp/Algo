import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];
        int forCount = sc.nextInt();

        for(int i=0;i<arr.length;i++){
            arr[i] = i+1;
        }


        for(int i=0;i<forCount;i++) {
            int a = sc.nextInt()-1;
            int b = sc.nextInt()-1;

            if(a==b){
                continue;
            }else if(a-b == -1){
                int tmp = arr[a];
                arr[a] = arr[b];
                arr[b] = tmp;
            }else if(a-b < -1){
                for(int c = a;c<b;c++){
                   int tmp = arr[c];
                   arr[c] = arr[b];
                   arr[b] = tmp;
                   b--;
                }
            }

        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }

    }
}//main