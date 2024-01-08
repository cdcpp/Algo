import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int count = 0;
       for(int i=0;i<n;i++){
           String voca = sc.next();
           boolean flag = checkGroupVoca(voca);
           if(flag){
                count++;
           }
       }
        System.out.println(count);

    }//main


    public static boolean checkGroupVoca(String voca){
        boolean flag = false;
        boolean [] flagArr = new boolean[26];

        for(int i=0;i<voca.length();i++){
            if(voca.length() == 1){
                flag = true;
                break;
            }
            if(i == 0) {
                flagArr[voca.charAt(i) - 97] = true;
            }else {
                if(flagArr[voca.charAt(i) - 97]){

                    if(voca.charAt(i) == voca.charAt(i-1)){
                        flag = true;
                        continue;
                    }else{
                        flag = false;
                        break;
                    }

                }else{
                    flagArr[voca.charAt(i) - 97] = true;
                    flag = true;
                }
            }

        }

        return flag;
    }
}

