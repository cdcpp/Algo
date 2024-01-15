import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int divnum = sc.nextInt();
        ArrayList<Character> list = new ArrayList<>();

        while (num > 0) {

            if (num % divnum < 10) {
                list.add((char) (num % divnum + '0'));
            } else {
                list.add((char) (num % divnum - 10 + 'A'));
            }

            num = num / divnum;




        }

        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i));
        }
    }

}
