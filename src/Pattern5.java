import java.util.Scanner;

class Generate5{
    void Pattern(int n){
        for(int i=1;i<n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
public class Pattern5 {
    public static void main(String[] args) {
        Generate5 gen = new Generate5();
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