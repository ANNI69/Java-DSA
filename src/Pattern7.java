import java.util.Scanner;

class Generate7{
    void Pattern(int n){
        for(int i=0;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for (int k=0;k<2*n-(2*i+1);k++){
                System.out.print("*");
            }
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
public class Pattern7 {
    public static void main(String[] args) {
        Generate7 gen = new Generate7();
        Scanner sc = new Scanner(System.in);
        int test ;
        int n;
        test = 3;
        for(int i=0;i<test;i++){
            n = sc.nextInt();
            gen.Pattern(n);
        }
    }
}