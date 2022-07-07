import java.util.Scanner;

public class j_9 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int sum=0;
        for(int i=1; i<=n; i++){
            sum=0;
            for(int j=1; j<=i; j++){
                if(i%j == 0)
                    sum++;
            }
            System.out.print(sum + " ");
        }

        scan.close();
    }
}
