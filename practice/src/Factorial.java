public class Factorial {
    public static void main(String [] args) {
        int a = 1;
        int sum= 0;
        for(int i = 1;i<=20;i++) {
            int j = i;
            while(j!=0) {
                a = a*j;
                j= j-1;
            }
            sum = a+sum;
            a = 1;
        }
        System.out.println(sum);
    }

}
/*public class Shape4 {
public static void main(String[] args) {
// TODO Auto-generated method stub
for(int i = 5; i > 0; i--){
for(int j = 0; j <= 4; j++){
if(j < i ){
System.out.print("*");
}else{
System.out.print(" ");
}
}
System.out.println();
}
}
}*/
