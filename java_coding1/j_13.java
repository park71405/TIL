import java.util.Scanner;

public class j_13 {
    public static void main(String[] args){
        try (Scanner scan = new Scanner(System.in)) {
            int i;
            int n = scan.nextInt();
            int num[] = new int[11];
            for(i=1; i<11; i++){
                num[i] = 0;
            }

            int tmp;
            while(n>0){
                tmp = n%10;
                num[tmp]++;
                n = n/10;
            }

            int max = num[1], t=1;
            for(i=2; i<11; i++){
                if(max < num[i]){
                    max = num[i];
                    t = i;
                }
            }

            System.out.println(t);

            scan.close();
        }
    }
}
