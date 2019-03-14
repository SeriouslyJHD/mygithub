/*四平方和
四平方和定理，又称为拉格朗日定理：每个正整数都可以表示为至多四个正整数的平方和。如果把 0 包括进去，就正好可以表示为四个数的平方和。
比如：
5=02+02+12+22
7=12+12+12+22
则对于一个给定的正整数 n，可以表示为：n=a2+b2+c2+d2。
你需要求出 字典序 最小的一组解 a,b,c,d。
字典序大小：从左到右依次比较，如果相同则比较下一项，直到有一项不同，较小的一方字典序更小，反之字典序更大，所有项均相同则二者字典序相同。
输入格式
程序输入为一个正整数 N(1≤N≤5000000)。
输出格式
输出四个非负整数 a,b,c,d，中间用空格分开。
样例输入1
5
样例输出1
0 0 1 2
样例输入2
12
样例输出2
0 2 2 2*/

import java.util.Scanner;

public class Lagrange {
    public static void main(String []args){
        input();
    }
    static void input(){
        Scanner in = new Scanner(System.in);
        int Number = in.nextInt();
        int maxSubNumber = (int) Math.sqrt(Number);
        out: for (int a = 0; a <= maxSubNumber; a++) {
            for (int b = a; b < maxSubNumber; b++) {
                for (int c = b; c <= maxSubNumber; c++) {
                    for (int d = c; d <= maxSubNumber; d++) {
                        int S = a * a + b * b + c * c + d * d;
                        if (S == Number) {
                            System.out.print(a);
                            System.out.print(" " + b);
                            System.out.print(" " + c);
                            System.out.print(" " + d);
                            break out;
                        }
                    }
                }
            }
        }

    }
}
