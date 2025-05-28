package BasicMaths;

class Examples {
    void reverseNumber(int n) {
        int temp = 0;
        int rev = 0;
        while (n > 0) {
            temp = n % 10;
            n = n / 10;
            rev = rev * 10 + temp;
        }
        System.out.println(rev);
    }

    void checkPalindrome(int n) {
        int a = n;
        int temp = 0;
        int rev = 0;
        while (a > 0) {
            temp = a % 10;
            a = a / 10;
            rev = rev * 10 + temp;
        }
        System.out.println(rev);
        if (rev == n)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }

    void checkPrime(int n) {
        System.out.println(n % 2 == 0);
    }

    void checkArmstrong(int n) {
        int temp = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            temp = n % 10;
            sum = sum + (temp * temp * temp);
            n = n / 10;
        }
        System.out.println(sum);
    }

    void printDivisors(int n, int m) {
        for (int i = 1; i <= n; i++) {
            if (m % i == 0) {
                System.out.println(i);
            }
        }
    }

    void greatestCommonDivisor(int a, int b) {
        for (int i = 1; i <= a+b; i++) {
            if (b % i == 0 && a % i == 0) {
                System.out.println(i);
            }
        }
    }


}

public class Maths {
    public static void main(String[] args) {
        Examples obj = new Examples();
//        obj.reverseNumber(1382392830);
//        obj.checkPalindrome(1382392830);
//        obj.checkPalindrome(151);
//        for (int i = 0; i < 10; i++) {
//            obj.checkPrime(i);
//        }
//          obj.checkArmstrong(371);
//        obj.printDivisors(100, 12 );
        obj.greatestCommonDivisor(9, 12);

    }
}