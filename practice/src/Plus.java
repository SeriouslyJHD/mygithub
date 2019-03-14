public class Plus {
    public static void main(String []args){
        int s=0;
        for(int i=100;i<201;i++)
        {
            s=s+i;
        }
        System.out.println("for循环："+s);
        int j=100;
        int h=0;
        do
        {
            h=h+j;
            j++;
        }while(j<201);
        System.out.println("do…while:"+h);
        int o=100;
        int l=0;
        while(o<201)
        {
            l=l+o;
            o++;
        }
        System.out.println("while:"+l);
    }
}
