package Patterns;

import java.util.Scanner;

class Generate14{
    void Pattern(int n){
        for (int i = 0; i <= n; i++) {
            for (char j = 'A'; j <= 'A'+ n*1-i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
public class Pattern14 {
    public static void main(String[] args) {
        Generate14 gen = new Generate14();
        Scanner sc = new Scanner(System.in);
        int test = 3;
        int n;
        for(int i=0;i<test;i++){
            n = sc.nextInt();
            gen.Pattern(n);
        }
    }
}