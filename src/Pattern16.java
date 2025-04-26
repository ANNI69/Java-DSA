import java.util.Scanner;

class Generate16{
    void Pattern(int n){
        for(int i=0;i<n;i++){
            char ch = (char)('A');
            int breakpoint = (2*i+1)/2;
            for(int j=1;j<n-i+1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print(ch);
                if (j<=breakpoint) ch++;
                else ch--;
            }
            System.out.println();

        }
    }
}
public class Pattern16 {
    public static void main(String[] args) {
        Generate16 gen = new Generate16();
        Scanner sc = new Scanner(System.in);
        int test = 3;
        int n;
        for(int i=0;i<test;i++){
            n = sc.nextInt();
            gen.Pattern(n);
        }
    }
}