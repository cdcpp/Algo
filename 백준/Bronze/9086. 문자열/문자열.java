
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] arr = new String[sc.nextInt()];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.next();

        }
        for(int i=0;i<arr.length;i++){
            System.out.println(""+arr[i].charAt(0)+arr[i].charAt(arr[i].length()-1));
        }

    }
}//main
