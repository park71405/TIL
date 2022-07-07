import java.util.Scanner;

public class j_22 {
    public static void main(String[] args){
        try (Scanner scan = new Scanner(System.in)) {
            int n = scan.nextInt();
            int k = scan.nextInt();

            int[] a = new int[n+1];

            int i;
            for(i=0; i<n; i++){
                a[i] = scan.nextInt();
            }

            int max = -217000000, sum=0;
            for(i=0; i<n-k; i++){
                sum = 0;
                for(int j=i; j<i+k; j++){
                    sum += a[j];
                }
                if(sum > max){
                    max = sum;
                }
            }

            System.out.println(max);

            scan.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
