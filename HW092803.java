import java.util.Scanner;

public class HW092803{
    static int a[];
    public static void main(String[] argv){
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("�п�J�}�Ca[]����:");
        n=input.nextInt();
        a=new int[n];
        for(int j=0;j<n;j++){
            System.out.println("�п�J�}�Ca["+j+"]:");
            a[j]=input.nextInt();
        }
        System.out.println("�}�C���������O�_���ߤ@ :"+abc(n));


        /*for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                if(a[i] == a[j]){
                    System.out.println("false");
                    break;
                }
            }
             System.out.println("true");
        }*/


        for(int j=0;j<n;j++){
            System.out.print(a[j]+" ");
        }

        }
        public static String abc(int n){
            for(int i=0;i<n-2;i++){
                for(int j=i+1;j<n-1;j++){
                    if(a[i] == a[j]){
                        return "false";
                    }
                }
            }
            return "true";
        }
}