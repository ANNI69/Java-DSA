package Patterns;

import java.util.Scanner;

class Generate6{
    void Pattern(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i+1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            for(int j=0;j<n-i+1;j++){
                System.out.print(" ");
            }
            System.out.println();

        }
    }
}
public class Pattern6 {
    public static void main(String[] args) {
        Generate6 gen = new Generate6();
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