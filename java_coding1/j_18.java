import java.util.Scanner;

public class j_18 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int m = scan.nextInt();

        int max=0, num, cnt=0;
        for(int i=1; i<=n; i++){
            num = scan.nextInt();
            if(num > m)
                cnt++;
            else{
                cnt = 0;
            }
            if(cnt > max)
                max = cnt;
        }

        System.out.println(max);

        scan.close();
    }
}
