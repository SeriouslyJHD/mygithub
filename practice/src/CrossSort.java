import java.util.Scanner;

/*交叉排序
蒜头君很无聊，现在有 N 个数，其中第 i(1≤i≤N) 个数是 Ai​。
现在他先将 Al1,Al1+1...Ar1从小到大排序。
再将 Al2,Al2+1...Ar2 从大到小排序。
请输出 A 排序后的最终结果。
输入格式
第一行五个整数 N,l1,r1,l2,r2(l1<r1,l2<r2)，均不超过 100000。
第二行 N 个不超过 int 范围的整数，表示 A 数组。
输出格式
一行 N 个用空格分隔的整数，表示 A 排序以后的结果。
样例输入
6 1 3 2 4
8 3 1 6 9 2
样例输出
1 8 6 3 9 2*/
public class CrossSort {
    public static void main(String []args){
        input();
    }
    static void input(){
        Scanner sc = new Scanner(System.in);
        int n,l1,r1,l2,r2;
        n = sc.nextInt();
        l1= sc.nextInt();
        r1= sc.nextInt();
        l2= sc.nextInt();
        r2= sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        for(int i=l1-1;i<r1;i++){//第一次排序l1->r1;
            for(int j=i+1;j<r1;j++){
                if(a[i]>a[j]){
                    int temp = a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        for(int i=l2-1;i<r2;i++){//第二次排序l2->r2;
            for(int j=i+1;j<r2;j++){
                if(a[i]<a[j]){
                    int temp = a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        for (int i=0;i<a.length;i++){//输出
            System.out.print(a[i]+" ");
        }
    }
}
