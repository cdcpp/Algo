import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int [] arr = new int[50000];
        int sum = 0;
        int idx = 0;

        for(int i=1;i<=1000;i++){
            for(int j=0;j<i;j++){
                idx ++;
                arr[idx] = i;
                if(idx >= a && idx <= b){
                    sum += arr[idx];
                }
                if(idx == b){
                    break;
                }
            }
            if(idx == b){
                break;
            }
        }
        System.out.println(sum);
    }

}
