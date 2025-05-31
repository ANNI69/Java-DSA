package Recursion;

public class SumOfN {
    int sum = 0;
    int Sum(int i, int n){
        if(i>n) return 0;
        sum = sum + i;
        Sum(i+1, n);
        return sum;
    }
    public static void main(String[] args) {
        SumOfN s = new SumOfN();
        System.out.println(s.Sum(0,3));
    }
}


