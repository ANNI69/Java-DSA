import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String result = str.substring(0,1);
        result = result.toUpperCase();
        System.out.println(result+str.substring(1));
    }
}