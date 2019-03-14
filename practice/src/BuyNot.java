import java.util.Scanner;
/*问题描述
小明开了一家糖果店。他别出心裁：把水果糖包成4颗一包和7颗一包的两种。糖果不能拆包卖。
小朋友来买糖的时候，他就用这两种包装来组合。当然有些糖果数目是无法组合出来的，比如要买 10 颗糖。
你可以用计算机测试一下，在这种包装情况下，最大不能买到的数量是17。大于17的任何数字都可以用4和7组合出来。
本题的要求就是在已知两个包装的数量时，求最大不能组合出的数字。
输入格式
两个正整数，表示每种包装中糖的颗数(都不多于1000)
输出格式
一个正整数，表示最大不能买到的糖数
样例输入1
4 7
样例输出1
17
样例输入2
3 5
样例输出2
7
*/
public class BuyNot {
    static int N=1000000;
    static boolean[] vis=new boolean[N];
    static boolean[] d=new boolean[N];
    static int a,b;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        a=in.nextInt();b=in.nextInt();
        if(a>b) {int t=a;a=b;b=t;}//保证a是最小的
        int count=0,i;
        d[0]=vis[0]=true;
        for(i=0;i<N;i++) {
            count= dp(i)?count+1:0;
            if(count==a) break;
        }
        System.out.println(i-a);
    }

    static boolean dp(int S) {
        if(vis[S])return d[S];
        vis[S]=true;
        return d[S]=(a<=S&&dp(S-a))||(b<=S&&dp(S-b));
    }
}
