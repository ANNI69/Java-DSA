class Generate1{
    void Pattern(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
public class Pattern1 {
    public static void main(String[] args) {
        Generate1 gen = new Generate1();
        gen.Pattern(10);
    }
}