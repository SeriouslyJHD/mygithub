import java.util.Scanner;

public class LetterGraphics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char str;
        char[][] pattern = new char[26][26];
        int i = 0, j = 0;
        for (i = 0; i < n; i++) {
            str = 'A';
            for (j = i; j < m; j++)        //此处两个循环用来控制存储字符的
            {
                pattern[i][j] = str++;
                //System.out.println("1:"+pattern[i][j]);
            }
            str = 'A';
            for (j = i - 1; j >= 0; j--) {
                pattern[i][j] = ++str;
                //System.out.println("2:"+pattern[i][j]);
            }
        }

        for (i = 0; i < n; i++)    //此处用来输出字符数组元素
        {
            for (j = 0; j < m; j++) {
                System.out.print(pattern[i][j]);
            }
            System.out.println("");
        }
    }
}