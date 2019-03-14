/*问题描述
100 可以表示为带分数的形式：100 = 3 + 69258 / 714。

还可以表示为：100 = 82 + 3546 / 197。

注意特征：带分数中，数字1~9分别出现且只出现一次（不包含0）。

类似这样的带分数，100 有 11 种表示法。

输入格式
从标准输入读入一个正整数N (N<1000*1000)

输出格式
程序输出该数字用数码1~9不重复不遗漏地组成带分数表示的全部种数。

注意：不要求输出每个表示，只统计有多少表示法！

样例输入1
100
样例输出1
11
样例输入2
105
样例输出2
6*/
import java.util.*;

public class T21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 0;
        for (int i = 1; i < n - 1; i++) {
            int L1 = String.valueOf(i).length(); //数字 i的长度
            int L2 = String.valueOf(n - i).length(); //数字(n - i) 的长度
            int L3 = ((9 - L1) & 1) == 1 ? (9 - L1) / 2 + 1: (9 - L1) / 2; //当(9 - L1)为奇数的时候
            L3 = (n - i) > 1 ? L3 - L2 / 2 : L3; //当(n - i) > 1的时候
            for (int k = 1; k < Math.pow(10, (L3)); k++) {
                int j = k * (n - i);
                String s = i + "" + j +"" + k; //将i,j,k三个数字拼接成一个字符串
                if(s.length() == 9) //当字符串的长度为9时满足条件
                {
                    if(c(s)){
                        count ++;
                    }
                }
            }
        }

        System.out.println(count);
    }
    //定义一个布尔函数，判断字符串是否满足条件
    public static boolean c(String s)
    {
        char[]c = s.toCharArray();
        Arrays.sort(c);
        String s1 = "123456789";
        if(String.valueOf(c).equals(s1))return true;
        return false;
    }

}
