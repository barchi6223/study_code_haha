import java.util.Scanner;

public class HW092801{
    public static void main(String[] argv){
        int n,x;
        int a[][]=new int[3][3];
        int b[][]=new int[3][3];
        int c[][]=new int[3][3];
        int d[][]=new int[3][3];
        long startTime,endTime;
        Scanner input = new Scanner(System.in);

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print("�п�J�}�CA["+i+"]"+"["+j+"]:");
                a[i][j]=input.nextInt();
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print("�п�J�}�CB["+i+"]"+"["+j+"]:");
                b[i][j]=input.nextInt();
            }
        }
        //��}�C�ۭ�
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                for(int k=0;k<3;k++){
                    c[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(c[i][j]+"  ");
            }
            System.out.println();
        }

        for(int i =0;i<3;i++){
            a[i][0] = c[i][0];
            a[i][1] = c[i][1];
            a[i][2] = c[i][2];
        }

        System.out.println("�п�J�����:");
        x=input.nextInt();
        //�}�C����B��
        startTime = System.nanoTime();
        for(int pow = 1;pow < x;pow++){
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    d[i][j] = 0;
                    for(int k=0;k<x;k++){
                        d[i][j] += c[i][k] * a[k][j];
                    }
                }
            }
            for(int i = 0;i<3;i++){
                for(int j = 0;j<3;j++){
                    c[i][j] = d[i][j];
                }
            }
        }
        endTime = System.nanoTime();
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(d[i][j]+"  ");
            }
            System.out.println();
        }
        System.out.println("�{�ǰ���ɶ��G "+(endTime-startTime)+"ns");

    }
}