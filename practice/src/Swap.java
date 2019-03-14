public class Swap {
    public static void main(String[] args) {

        int x = 44;
        int y = 77;
        System.out.println("x,y:" + x + "," + y);
        int tmp = 0;
        tmp = x;
        x = y;
        y = tmp;
        tmp = 0;
        System.out.println("x,y:" + x + "," + y);
        System.out.println(tmp);
    }

}
