import java.util.Scanner;

/*矩阵扭转
        给出一个 n×m 的整数矩阵，请你把这个矩阵顺时针旋转 90o 以后输出。
        输入格式
        第一行输入两个整数 n,m(1≤n,m≤200)，用空格隔开。
        接下来 n 行，每行输入 m 个整数，表示输入的矩阵。矩阵中元素都是 int 范围内的整数。
        输出格式
        输入 m 行，每行 n 个空格隔开的整数，表示旋转以后的矩阵。注意：每行末尾不能输出多余的空格。
        样例输入
        3 4
        -1 3 6 3
        7 7 9 1
        10 3 4 6
        样例输出
        10 7 -1
        3 7 3
        4 9 6
        6 1 3*/
public class MatrixTorsion {
    public static void main(String []args){
        input();
    }
    static void input(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//输入的行数，扭转后的列数
        int m = sc.nextInt();//输入的列数，扭转后的行数
        int a[][] = new int[n][m];
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                a[i][j] = sc.nextInt();
            }
        }
        int b[][] = new int[m][n];
        for(int i=0;i<m;i++){//这里并不是真正的把矩阵扭转了，而是找规律，换了一种输出方式而已
            for(int j=n-1;j>=0;j--){
                if(j==0){//因为每一行的末尾不能输出空格，所以在这判断一下，如果是末尾就不输出空格就好了
                    System.out.print(a[j][i]);
                }else{
                    System.out.print(a[j][i]+" ");
                }
            }
            System.out.println();
        }
    }
}
