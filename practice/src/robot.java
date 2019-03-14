import java.util.Scanner;

/*机器人
蒜头君收到了一份礼物，是一个最新版的机器人。这个机器人有4种指令：
1.forward x，前进 x 米。
2.back x，先向后转，然后前进 x 米。
3.left x，先向左转，然后前进 x 米。
4.right x，先向右转，然后前进 x 米。
现在把机器人放在坐标轴原点，起始朝向为 x 轴正方向。经过一系列指令以后，你能告诉蒜头君机器人的坐标位置吗。坐标轴上一个单位长度表示 1 米。
输入格式
第一行输入一个整数 n(1≤n≤100) 表示指令的个数。
接下里 n 行，每行输入形如上面的指令，其中 −1000≤x≤1000。
输出格式
输出两个整数 x,y表示机器人最后坐标。用空格隔开。
样例输入
10
back -9
left 3
left 8
back 15
right 10
right -7
right -3
left 11
right 17
left 3
样例输出
9 -7
*/
public class robot {
    public static void main(String []args){
        input();
    }
    static void input(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str[] = new String [n];//存放指令
        int step[] = new int[n];//存放路程
        int flag[] = new int[4];//机器人的方向标志位 d[0]->上，d[1]->右，d[2]->下，d[3]->左
        int x = 0,y = 0;//坐标
        int j = 1;//初始方向为右
        for(int i=0;i<n;i++){
                str[i] = sc.next();
                step[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
         if(str[i]=="forward"){//right
            flag[j] = flag[j] + step[i];
         }
         if(str[i]=="right"){//down
             j = (j+1)%4;//j=2
             flag[j] = flag[j] + step[i];
         }
         if(str[i]=="back"){//left
             j = (j+2)%4;//j=3
             flag[j] = flag[j] + step[i];
         }
         if(str[i]=="left"){//up
             j = (j+3)%4;//j=0
             flag[j] = flag[j] + step[i];
         }
        }
        x = flag[1] - flag[3];//右减左
        y = flag[0] - flag[2];//上减下
        System.out.print(x+" "+y);
    }
}
