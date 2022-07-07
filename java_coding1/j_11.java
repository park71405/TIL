import java.util.Scanner;

public class j_11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int tmp, sum=0;
        for(int i=1; i<=n; i++){
            tmp = i;
            while(tmp > 0){
                sum++;
                tmp = tmp/10;
            }
        }

        System.out.println(sum);

        scan.close();
    }
}
