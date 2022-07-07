import java.util.Scanner;

public class j_17 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int num, sum, sum1=0;
        for(int i=0; i<n; i++){
            sum1 = 0;
            num = scan.nextInt();
            sum = scan.nextInt();
            for(int j=1; j<=num; j++)
                sum1 += j;
            if(sum1 == sum){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }

        scan.close();
    }
}
