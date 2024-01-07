import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String [] check = {"c=","c-","dz=","d-","lj","nj","s=","z="};

        for(int i=0;i<check.length;i++){
            if(a.contains(check[i])){
                
                a = a.replaceAll(check[i],"1");
            }

        }

        System.out.println(a.length());

    }//main

}