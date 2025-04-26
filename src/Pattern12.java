import java.util.Scanner;

class Generate12{
    void Pattern(int n){
        int num=1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " AC");
                num++;
            }
            System.out.println();
        }
    }
}
public class Pattern12 {
    public static void main(String[] args) {
        Generate12 gen = new Generate12();
        Scanner sc = new Scanner(System.in);
        int test = 3;
        int n;
        for(int i=0;i<test;i++){
            n = sc.nextInt();
            gen.Pattern(n);
        }
    }
}