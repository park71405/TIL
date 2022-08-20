import java.util.Scanner;
import java.util.Arrays;

public class j_40 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int a[] = new int[n];
        int i;
        for(i=0; i<n; i++){
            a[i] = scan.nextInt();
        }
        Arrays.sort(a);

        int m = scan.nextInt();
        int b[] = new int[m];
        for(i=0; i<m; i++){
            b[i] = scan.nextInt();
        }
        Arrays.sort(b);

        int p1=0, p2=0, p3=0;
        int c[] = new int[n+m];

        while(p1 < n && p2 < m){
            if(a[p1] == b[p2]){
                c[p3] = a[p1];
                p3++;
                p1++;
                p2++;
            }else if(a[p1] < b[p2]){
                p1++;
            }else{
                p2++;
            }
        }

        for(i=0; i<p3; i++){
            System.out.print(c[i] + " ");
        }

        scan.close();
    }
}
