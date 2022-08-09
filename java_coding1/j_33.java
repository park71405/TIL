import java.util.Scanner;

public class j_33 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int a[] = new int[n];
        int i, j, tmp, tmp1;
        for(i=0; i<n; i++){
            a[i] = scan.nextInt();
        }

        for(i=0; i<n-1; i++){
            tmp = i;
            for(j=i+1; j<n; j++){
                if(a[j]>a[tmp])
                    tmp = j;
            }
            tmp1 = a[i];
            a[i] = a[tmp];
            a[tmp] = tmp1;
        }

        tmp=1;
        for(i=0; i<n-1; i++){
            if(a[i] != a[i+1]){
                tmp++;
            }
            if(tmp == 3){
                System.out.println(a[i+1]);
                break;
            }
        }

        scan.close();
    }
}
