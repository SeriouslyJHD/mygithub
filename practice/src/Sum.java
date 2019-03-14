import java.util.Scanner;

public class Sum {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a%2==0){
            System.out.print((long)(a/2)*(a+1));
        }else{
            System.out.print((long)((a+1)/2)*(a+2)-(a+1));
        }
    }
}
