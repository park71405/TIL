import java.util.Scanner;

public class j_1 {
    public static void main(String[] args){
        try (Scanner scan = new Scanner(System.in)) {
            int n = scan.nextInt();
            int m = scan.nextInt();

            int i, sum=0;
            for(i=m; i<=n; i++){
                if(i % m == 0){
                    sum += i;
                }
            }

            System.out.println(sum);

            scan.close();
        }
    }
}