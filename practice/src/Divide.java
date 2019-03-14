import java.util.Scanner;

public class Divide {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);     //实例化
        System.out.println("请输入数字：");
        int x=s.nextInt();
        if(x%3==0 && x%5==0 && x%7==0){
            System.out.println("该数能被3、5、7同时整除");
        }
        else{
            System.out.println("该数不能被3、5、7同时整除");
        }
    }

}
