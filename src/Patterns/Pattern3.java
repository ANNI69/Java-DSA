package Patterns;

import java.util.Scanner;

class Generate3{
    void Pattern(int n){
        for(int i=0;i<n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
public class Pattern3 {
    public static void main(String[] args) {
        Generate3 gen = new Generate3();
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