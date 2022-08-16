import java.util.Scanner;

public class j_37 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int s = scan.nextInt();
        int n = scan.nextInt();
        
        int i, j, a, pos;
        int C[] = new int[20];

        for(i=1; i<=n; i++){
            a = scan.nextInt();
            pos = -1;
            for(j=0; j<s; j++){
                if(C[j] == a)
                    pos = j;
            }
            if(pos == -1){
                for(j=s-1; j>=1; j--)
                    C[j] = C[j-1];
            }else{
                for(j=pos; j>=1; j--)
                    C[j] = C[j-1];
            }
            C[j] = a;
        }

        for(i=0; i<s; i++)
            System.out.print(C[i] + " ");

        scan.close();
    }
}
