import java.util.Scanner;

public class j_15 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int sum=0;
        int n = scan.nextInt();
        boolean a;
        for(int i=2; i<=n; i++){
            a = true;
            for(int j=2; j<i; j++){
                if(i%j == 0){
                    a = false;
                    break;
                }
            }
            if(a)
                sum++;
        }

        System.out.println(sum);

        scan.close();
    }
}
