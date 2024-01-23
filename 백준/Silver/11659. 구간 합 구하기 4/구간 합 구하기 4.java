import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int alen = sc.nextInt();
        int count = sc.nextInt();

        int arr[] = new int[alen];

        for(int i=0;i<arr.length;i++){
            if(i==0){
                arr[i] = sc.nextInt();
            }else{
                arr[i] = arr[i-1] + sc.nextInt();
            }
        }


        for(int i=0;i<count;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            if(a == 1){
                System.out.println(arr[b-1]);
            }else{
                System.out.println(arr[b-1] - arr[a-2]);
            }
        }




    }

}
