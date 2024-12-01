import java.util.Scanner;
public class Fibnacci {
    public static void main(String[] args){
        Scanner sca =new Scanner(System.in);
        System.out.print("enter the number for fibonacci Series");
        int number=sca.nextInt();
        int n1=0;
        int n2=1;
        System.out.println(n1+  " "+n2);
        for (int i=3;i<=number;i++){
            int nextnum=n1+n2;
            System.out.println(" "+nextnum);
            n1=n2;
            n2=nextnum;
        }
    }
}
