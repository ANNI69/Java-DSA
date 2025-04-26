package Patterns;

import java.util.Scanner;

class Generate2 {
    void Pattern2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
public class Pattern2 {
    public static void main(String[] args) {
        Generate2 gen = new Generate2();
        Scanner sc = new Scanner(System.in);
        int test ;
        int n;
        test = 3;
        for(int i=0;i<test;i++){
            n = sc.nextInt();
            gen.Pattern2(n);
        }
    }
}
