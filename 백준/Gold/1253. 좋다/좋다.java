import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int arrLength = sc.nextInt();
        int [] arr = new int[arrLength];

        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int count = 0;
        int k=0;
        for(int i=0;i<arr.length;i++) {
            k = arr[i];
            int start = 0;
            int end = arrLength - 1;
            while (start < end) {

                if(start != i && end != i){



                    if (arr[start] + arr[end] < k) {
                        start++;
                    } else if (arr[start] + arr[end] > k) {
                        end--;
                    }
                    else {
                        count++;
                        break;
                    }
                }else {
                    if (arr[start] == k) {
                        start++;
                    }
                    if (arr[end] == k) {
                        end--;
                    }
                }
            }
        }
        System.out.println(count);
    }//main

}
