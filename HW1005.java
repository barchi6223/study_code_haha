import java.util.Scanner;

public class HW1005{
    public static void main(String[] argv){
        int m,n,x=0,a=0,ans;
        Scanner input = new Scanner(System.in);
        System.out.println("��Jm�Pn���X�����k");
        System.out.print("�п�Jm:");
        m=input.nextInt();
        System.out.print("�п�Jn:");
        n=input.nextInt();

        System.out.println(m+"   "+n);
        while(m!=1){
            if (m%2 != 0) {
                m=m/2; x+=n; a=n;
            }else{
                m=m/2; a=0;
            }
            n=n*2;
            System.out.println(m+"   "+n+"   (+"+a+")");
        }
        ans=n+x;
        System.out.print(n+"+"+x+"="+ans);

    }
}