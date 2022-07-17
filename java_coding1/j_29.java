import java.util.Scanner;

public class j_29 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int cnt =0;
        for(int i=1; i<=n; i++){
            int tmp = i;
            while(tmp > 0){
                if(tmp%10 == 3){
                    cnt++;
                }
                tmp = tmp / 10;
            }
        }

        System.out.println(cnt);

        scan.close();
    }
}
