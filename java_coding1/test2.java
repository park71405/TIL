import java.util.Scanner;

public class test2 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        
        int t = scan.nextInt();
        int tmp[] = new int[t+1];
        
        for(int z=1; z<=t; z++){
            int n = scan.nextInt();
            int m = scan.nextInt();
            
            int[][] a = new int[20][20];
            int[][] dy = new int[20][20];

            int i, j;
            for(i=1; i<=n; i++){
                for(j=1; j<=n; j++){
                    a[i][j] = scan.nextInt();
                    dy[i][j] = dy[i-1][j] + dy[i][j-1]-dy[i-1][j-1] + a[i][j];
                }
            }

            int sum, max = -2147000000;
            for(i=m; i<=n; i++){
                for(j=m; j<=n; j++){
                    sum = dy[i][j] - dy[i-m][j] - dy[i][j-m] + dy[i-m][j-m];
                    if(sum > max)
                        max = sum;
                }
            }
            tmp[z] = max;
        }

        for(int a=1; a<=t; a++)
            System.out.println("#"+ a + " " + tmp[a]);

        scan.close();
    }
}
