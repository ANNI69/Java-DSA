import java.util.Scanner;

class Generate8{

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
    void Pattern0(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i+1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            for(int j=0;j<n-i+1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
public class Pattern8 {
    public static void main(String[] args) {
        Generate8 gen = new Generate8();
        Scanner sc = new Scanner(System.in);
        int test ;
        int n;
        test = 3;
        for(int i=0;i<test;i++){
            n = sc.nextInt();
            gen.Pattern0(n);
            gen.Pattern(n);
        }
    }
}