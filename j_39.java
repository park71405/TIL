import java.util.Scanner;

public class j_39{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int a[] = new int[n];
        int i, p1, p2, p3;
        for(i=0; i<n; i++){
            a[i] = scan.nextInt();
        }

        int m = scan.nextInt();
        int b[] = new int[m];
        for(i=0; i<m; i++){
            b[i] = scan.nextInt();
        }

        int c[] = new int[n+m];
        p1=0; p2=0; p3=0;
        while(p1 < n && p2 < m){
            if(a[p1] > b[p2]){
                c[p3] = b[p2];
                p2++;
                p3++;
            }
            else{
                c[p3] = a[p1];
                p1++;
                p3++;
            }
        }
        while(p1 < n){
            c[p3] = a[p1];
            p3++;
            p1++;
        }
        while(p2 < m){
            c[p3] = b[p2];
            p3++;
            p2++;
        }

        for(i=0; i<n+m; i++){
            System.out.print(c[i] + " ");
        }

        scan.close();
    }
}