import java.util.Scanner;

/*最大子阵
给定一个 n×m的矩阵 A，求 A 中的一个非空子矩阵，使这个子矩阵中的元素和最大。其中，A的子矩阵指在 A 中行和列均连续的一部分。
输入格式
输入的第一行包含两个整数 n,m(1≤n,m≤50)，分别表示矩阵 A 的行数和列数。
接下来 n 行，每行 m 个整数，表示矩阵 Ai,j(−1000≤Ai,j≤1000)。
输出格式
输出一行，包含一个整数，表示 A 中最大子矩阵的元素和。
样例输入
3 3
2 -4 1
-1 2 1
4 -2 2
样例输出
6*/
public class BiggestSonStr {
    public static void main(String[] args) {
        input();
    }

    static void input() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//输入矩阵行数
        int m = sc.nextInt();//输入矩阵列数
        int a[][] = new int[n][m];
        int b[] = new int[m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        //将一个二维数组压缩成为一个一维数组，这样最大子阵就变成了一个最大字串
        for(int i=0;i<m;i++){
            for(int j=n-1;j>0;j--){
                b[i] += a[j][i];
            }
        }
        int result = b[0];
        int maxResult = b[0];
        for (int i = 1; i < b.length; i++) {
            result += b[i];
            // 相加之后大于结果值，注意需要考虑全是负数的情况
            if (result > maxResult) {
                // 比较是否大于最大值maxResult
                maxResult = result;
            }else {
                if (result < 0) {
                    // 否则如果相加的结果小于0，并且小于maxResult，这个子串的最大值就确定下来了
                    result = 0;//重置
                }
            }
        }
        System.out.print(maxResult);
    }

}
