package Recursion;

public class RecursionWithBacktracking {

    void Backtracking(int i, int j) {
        if (i > j) return;
        Backtracking(i-1,j);
        System.out.println(i);
    }


    public static void main(String[] args) {
        RecursionWithBacktracking rwb = new RecursionWithBacktracking();
        rwb.Backtracking(0,2);
    }
}
