import java.util.Scanner;

public class Main {

    public int Fibonacci(int n) {

        int n1 = 1;
        int n2 = 1;
        int n3 = 2;
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        if (n == 2)
            return 1;
        if (n == 3)
            return 2;

        for (int i = 3; i < n; i++) {

            n1 = n2;
            n2 = n3;
            n3 = n1 + n2;
        }
        return n3;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Main m = new Main();
         if(m.Fibonacci(a)<10007){
             System.out.println(m.Fibonacci(a));
         }else{
             System.out.println(m.Fibonacci(a)%10007);
         }
    }
}
