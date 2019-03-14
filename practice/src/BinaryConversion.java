import java.util.Scanner;

/*进制转换
输入一个十进制数 N，将它转换成 R 进制数输出。
在 10≤R≤16的情况下，用'A'表示 10，用'B'表示 11，用'C'表示 12，用'D'表示 13，用'E'表示 14，用'F'表示 15。
输入格式
输入包含两个整数 N(N≤10000) 和 R(2≤R≤16)。
注意，N 有可能是负整数。
输出格式
输出一行，表示转换后的数。
样例输入
23 12
样例输出
1B */
public class BinaryConversion {
    public static void main(String []args){
        input();
    }
    static void input(){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext())
        {
            int n=sc.nextInt();
            int x=sc.nextInt();
            System.out.println(Integer.toString(n,x).toUpperCase());
        }

    }
}
