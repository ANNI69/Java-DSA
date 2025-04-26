import java.util.Scanner;

class Generate13{
    void Pattern(int n){
        for (int i = 0; i <= n; i++) {
            for (char j = 'A'; j <= 'A'+i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
//n-i+1
public class Pattern13 {
    public static void main(String[] args) {
        Generate13 gen = new Generate13();
        Scanner sc = new Scanner(System.in);
        int test = 3;
        int n;
        for(int i=0;i<test;i++){
            n = sc.nextInt();
            gen.Pattern(n);
        }
    }
}