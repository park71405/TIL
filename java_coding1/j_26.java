import java.util.Scanner;

public class j_26 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        int i, j;
        for(i=0; i<n; i++){
            a[i] = scan.nextInt();
            b[i] = i+1;
        }

        for(i=n-1; i>=0; i--){
            for(j=i-1; j>=0; j--){
                if(a[i] > a[j]){
                    b[i]--;
                }
            }
        }

        for(i=0; i<n; i++){
            System.out.print(b[i] + " ");
        }

        
        scan.close();
    }
}
