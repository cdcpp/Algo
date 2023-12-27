import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        for (int i = 1; i <= count; i++) {

            int a = sc.nextInt();
            String b = sc.next();
            String dab = "";

            for (int k = 0; k < b.length(); k++) {

                for (int z = 1; z <= a; z++) {

                    dab += String.valueOf(b.charAt(k));

                }
            }
            System.out.println(dab);
        }
    }//main
}