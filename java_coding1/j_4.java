import java.util.Scanner;

public class j_4 {
    public static void main(String[] args){
        try (Scanner scan = new Scanner(System.in)) {
            int n = scan.nextInt();
            int i;
            int num[] = new int[n];

            for(i=0; i<n; i++)
                num[i] = scan.nextInt();
            
            int min = num[0];
            int max = num[0];
            for(i=1; i<n; i++){
                if(min > num[i])
                    min = num[i];
                if(max < num[i])
                    max = num[i];
            }

            System.out.println(max - min);

            scan.close();
        }
    }
}
