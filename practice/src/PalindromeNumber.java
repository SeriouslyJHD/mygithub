import java.util.Scanner;
/*
练习题：回文数
一个正整数，如果交换高低位以后和原数相等，那么称这个数为回文数。比如 121，2332 都是回文数，13,456713,4567 不是回文数。
任意一个正整数，如果其不是回文数，将该数交换高低位以后和原数相加得到一个新的数，如果新数不是回文数，重复这个变换，直到得到一个回文数为止。例如，57 变换后得到 132(57+75)，132 得到 363(132+231)，363是一个回文数。
曾经有数学家猜想：对于任意正整数，经过有限次上述变换以后，一定能得出一个回文数。至今这个猜想还没有被证明是对的。现在请你通过程序来验证。
输入格式
输入一行一个正整数n。
输出格式
输出第一行一个正整数，表示得到一个回文数的最少变换次数。
接下来一行，输出变换过程，相邻的数之间用"--->"连接。输出格式可以参见样例。
保证最后生成的数在 int 范围内。
样例输入
349
样例输出
3
349--->1292--->4213--->7337
 */
public class PalindromeNumber {
    static int cont=0;
    static StringBuffer re=new StringBuffer("");
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char[] ns=(n+"").toCharArray();
        jia(ns,n);
        System.out.println(cont);
        System.out.println(re.toString());
    }
    //递归累加用while也可以
    public static void jia(char[] ns,int n){
        re.append(n);
        if (juge(ns)){
            return;
        }else {
            cont++;
            int m=0;
            for (int i = 0; i <ns.length ; i++) {
                m+=(ns[i]-48)*(Math.pow(10,i));
            }
            int r=m+n;
            re.append("--->");
            char[] newr=(r+"").toCharArray();
            jia(newr,r);
        }

    }
    //判断是否为回文数字
    public static boolean juge(char[] ns){
        int mid=ns.length/2;
        boolean res=true;
        int left=0;
        int right=0;
        if (ns.length%2==0){
            right=ns.length/2;
            left=(ns.length-1)/2;
            while (left>=0&&right<ns.length){
                if (ns[left]==ns[right]){
                    res=res&&true;
                    left--;
                    right++;
                }else {
                    res=res&&false;
                    break;
                }
            }
        }else {
            while (left>=0&&right<ns.length){
                right=ns.length/2+1;
                left=ns.length/2-1;
                if (ns[left]==ns[right]){
                    res=res&&true;
                    left--;
                    right++;
                }else {
                    res=res&&false;
                    break;
                }
            }
        }
        return res;
    }
}
