import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = new char[26];
        int[] arr2 = new int[26];

        String a = sc.next();
        for(int i=0;i<arr.length;i++){
            arr[i] += (97 + i);
            arr2[i] = -1;
        }



        for(int i=0;i<a.length();i++){

            for(int k=0;k<arr.length;k++){
                if(arr[k] == a.charAt(i) ){
                    if(arr2[k] != -1){
                        continue;
                    }
                    arr2[k] = i;
                }
            }

        }

        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i] + " ");
        }



    }//main
}
