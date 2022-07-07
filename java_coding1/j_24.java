import java.util.Scanner;

public class j_24 {
    public static void main(String[] args){
        try (Scanner scan = new Scanner(System.in)) {
            int n, i, now, pre, pos;
            n = scan.nextInt();

            int[] ch = new int[n];

            pre = scan.nextInt();
            for(i=1; i<n; i++){
                now = scan.nextInt();
                pos = Math.abs(pre-now);
                if(pos > 0 && pos <n && ch[pos] == 0)
                    ch[pos] = 1;
                else{
                    System.out.println("NO");
                    System.exit(0);
                }
                pre = now;
            }

            System.out.println("YES");

            scan.next();
        }
    }
}
