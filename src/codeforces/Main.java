import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // total participants
        int k = scanner.nextInt(); // cut-off position
        int[] scores = new int[n];

        for (int i = 0; i < n; i++) {
            scores[i] = scanner.nextInt();
        }

        int cutoff = scores[k - 1]; // k-th place score (1-based index)
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (scores[i] >= cutoff && scores[i] > 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}
