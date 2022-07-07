import java.util.Scanner;

public class j_19 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] h = new int[101];
        for(int i=1; i<=n; i++){
            h[i] = scan.nextInt();
        }

        int cnt = 0;
        int max = h[n];
        for(int i=n-1; i>=1; i--){
            if(h[i] > max){
                max = h[i];
                cnt++;
            }
        }

        System.out.println(cnt);

        scan.close();
    }
}
