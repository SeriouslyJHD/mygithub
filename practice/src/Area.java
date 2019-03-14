import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        double PI = Math.PI;
        double area = PI * r * r;
        String a = String.format("%.7f", area);
        System.out.print(a);
    }

}
