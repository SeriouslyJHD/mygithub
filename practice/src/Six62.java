public class Six62 {
    public static void main(String[] args) {

        int a=13;
        int b=0;	//加10的次数
        int c=10;
        int sum=0;
        System.out.println("a的值\t"+"b的值\t"+"sum的值");
        do {
            if(b%2==0) {
                sum+=a;
                System.out.println(a+"\t"+b+"\t"+sum);
            }else {
                sum-=a;
                System.out.println(a+"\t"+b+"\t"+sum);
            }
            a+=c;
            b++;
        }while(a<=1003);
        System.out.println("最终结果为："+sum);

    }

}
