import java.util.Scanner;

public class j_10 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] num = new int[n];
        for(int i=0; i<n; i++){
            num[i] = scan.nextInt();
        }

        int tmp, sum=0;
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            sum=0;
            tmp = num[i];
            while(tmp > 0){
                sum += tmp%10;
                tmp = tmp/10;
            }
            a[i] = sum;
        }
        int max = a[0];
        int t = 0;
        for(int i=1; i<n; i++){
            if(max < a[i]){
                max = a[i];
                t = i;
            }
            else if(max == a[i]){
                if(num[t] > num[i]){
                    max = a[t];
                }else{
                    max = a[i];
                    t = i;
                }
            }
        }

        System.out.println(num[t]);
        
        scan.close();
    }
}
