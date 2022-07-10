import java.util.Scanner;
import java.util.Vector;

public class j_27 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int i, j, tmp;

        int ch[] = new int[n+1];

        for(i=2; i<=n; i++){
            tmp = i;
            j = 2;
            while(true){
                if(tmp%j == 0){
                    ch[j]++;
                    tmp = tmp/j;
                }
                else
                    j++;
                if(tmp == 1){
                    break;
                }
            }
        }
        System.out.printf("%d! = ", n);
        for(j=2; j<=n; j++){
            if(ch[j] != 0)
                System.out.printf("%d ", ch[j]);
        }

        scan.close();
    }
}
