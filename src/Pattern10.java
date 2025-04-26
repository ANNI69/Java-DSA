import java.util.Scanner;

class Generate10{
    void Pattern(int n){
        for(int i=1;i<=2*n-1;i++){
            int stars = i;
            if (i > n) stars = 2*n-i;
            for(int j=1;j<=stars;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
public class Pattern10 {
    public static void main(String[] args) {
        Generate10 gen = new Generate10();
        Scanner sc = new Scanner(System.in);
        int test = 3;
        int n;
        for(int i=0;i<test;i++){
            n = sc.nextInt();
            gen.Pattern(n);
        }
    }
}