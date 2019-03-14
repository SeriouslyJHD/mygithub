import java.util.Scanner;

/*蒜头君的随机数
蒜头君想在学校中请一些同学一起做一项问卷调查，为了确保实验的客观性，他先用计算机生成了 n(1≤n≤100)个 1 到 1000 之间的随机整数，对于其中重复的数字，只保留一个，把其余相同的数去掉，不同的数对应着不同的学生的学号。然后再把这些数从小到大排序，按照排好的顺序去找同学做调查。
请你协助蒜头君完成“去重”与“排序”的工作。
输入格式
共两行，第一行为一个正整数 n。
第二行有 n 个用空格隔开的正整数，为所产生的随机数。
输出格式
第一行输出一个正整数 m，表示不相同的随机数的个数。第二行输出 m 个用空格隔开的正整数，为从小到大排好序的不相同的随机数。
样例输入
10
20 40 32 67 40 20 89 300 400 15
样例输出
8
15 20 32 40 67 89 300 400*/
public class DuplicateRemoval {
    public static void main(String []args){
        input();
    }
    static void input(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//输入数组的长度
        int a[] = new int [n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        for (int i=0;i<n;i++){//先将输入的数组进行排序
            for (int j=i+1;j<n;j++){
                    if(a[i]>a[j]){
                        int temp = a[i];
                        a[i]=a[j];
                        a[j]=temp;
                    }
            }
        }
        int count = a.length;//数组长度
        for (int i=0;i<n;i++){//将重复的元素置为0
            for (int j=i+1;j<n;j++){
                if(a[i]==a[j]){
                    a[i]=0;
                    count--;//同时将长度减1
                }
            }
        }
        System.out.println(count);//输出的是去重之后的数组长度
        for(int i=0;i<a.length;i++){
            if(a[i]!=0){
                System.out.print(a[i]+" ");
            }

        }
    }
}
