import java.util.Scanner;

public class j_36 {
    public static void main(String[] args){
        try (Scanner scan = new Scanner(System.in)) {
            int n = scan.nextInt();

            int a[] = new int[n];
            int i, j, tmp;

            for(i=0; i<n; i++)
                a[i] = scan.nextInt();

            for(i=1; i<n; i++){
                tmp = a[i];
                for(j=i-1; j>=0; j--){
                    if(a[j] > tmp)
                        a[j+1] = a[j];
                    else
                        break;
                }
                a[j+1] = tmp;
            }

            for(i=0; i<n; i++)
                System.out.print(a[i] + " ");

            scan.close();
        }
    }
}
