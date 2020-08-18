package B;

import java.util.Scanner;

/**
 * @author liuyuzhe@sinosoft.com.cn
 * @date 2020-8-18
 */
public class IfElse {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scanner.nextInt();
        String ans;
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
/*        if ((N&1)==1){
            System.out.println("Weird");
        }else {
            System.out.println("Not Weird");
        }*/
        if(n%2 == 1 || n>= 6 && n<=20){
            ans = "Weird";
        }
        else if (n%2 == 0 || n >= 2 && n <= 5){
            ans = "Not Weird";
        }
        else{
            ans = "Not Weird";
        }
        System.out.println(ans);
    }
}
