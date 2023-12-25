import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float[] arr = new float[sc.nextInt()];
        float maxScore = 0;
        float score = 0;
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
            if(arr[i] > maxScore){
                maxScore = arr[i];
            }
        }

        for(int i=0;i<arr.length;i++){
            arr[i] = (arr[i] / maxScore) * 100;
            score += arr[i];
        }

        System.out.println(score/arr.length);
        
    }
}//main