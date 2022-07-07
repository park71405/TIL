import java.util.Scanner;

public class j_25{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] a = new int[n];
        int[] b= new int[n];
        int i;

        for(i=0; i<n; i++){
            a[i] = scan.nextInt();
            b[i] = 1;
        }

        int p1, j;
        for(i=0; i<n; i++){
            for(j=0; j<n; j++){
                if(i == j)  continue;
                if(a[i] < a[j])
                    b[i]++;
            }
        }

        for(i=0; i<n; i++){
            System.out.print(b[i] + " ");
        }

        scan.close();
    }
}