import java.util.Scanner;

class Generate11{
    void Pattern(int n){
        int space  = 2* (n-1);
        for(int i=1;i<=n;i++){
            //Numbers
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            //Spaces
            for(int k=1;k<=space;k++){
                System.out.print(" ");
            }
            //Number
            for (int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
            space-=2;
        }
    }
}
public class Pattern11 {
    public static void main(String[] args) {
        Generate11 gen = new Generate11();
        Scanner sc = new Scanner(System.in);
        int test = 3;
        int n;
        for(int i=0;i<test;i++){
            n = sc.nextInt();
            gen.Pattern(n);
        }
    }
}