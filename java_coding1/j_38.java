import java.util.Scanner;

public class j_38 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int a[] = new int[n+1];
        int b[] = new int[n+1];
        int i, j, pos;

        for(i=1; i<=n; i++)
            a[i] = scan.nextInt();

        for(i=n; i>=1; i--){
            pos = i;
            for(j=1; j<=a[i]; j++){
                b[pos] = b[pos+1];
                pos++;
            }
            b[pos] = i;
        }

        for(i=1; i<=n; i++)
            System.out.print(b[i] + " ");

        scan.close();
    }
}
