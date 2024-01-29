import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int arrIndex = Integer.parseInt(st.nextToken());
        int count = Integer.parseInt(st.nextToken());

        int[][] arr = new int[arrIndex+1][arrIndex+1];
        int[][] sumArr = new int[arrIndex+1][arrIndex+1];

        for(int i=1;i<arr.length;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=1;j<arr.length;j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i=1;i<sumArr.length;i++){

            for(int j=1;j<sumArr.length;j++){
                sumArr[i][j] = sumArr[i][j-1] + sumArr[i-1][j] - sumArr[i-1][j-1] + arr[i][j];
                //sumArr[j][i] = sumArr[j-1][i] + arr[j][i];

            }

        }

        for(int i=0;i<count;i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());

            int sum = sumArr[c][d] - sumArr[a-1][d] - sumArr[c][b-1] + sumArr[a-1][b-1];
            System.out.println(sum);

        }

    }//main

}