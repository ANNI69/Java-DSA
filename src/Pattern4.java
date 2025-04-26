import java.util.Scanner;

class Generate4{
    void Pattern(int n){
        for(int i=0;i<n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
public class Pattern4 {
    public static void main(String[] args) {
        Generate4 gen = new Generate4();
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