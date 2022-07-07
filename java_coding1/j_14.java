import java.util.Scanner;

public class j_14 {
    public static void main(String[] args){
        try (Scanner scan = new Scanner(System.in)) {
            int n = scan.nextInt();
            int a;

            int i;
            for(i=0; i<n; i++){
                a = scan.nextInt();
                a = reverse(a);
                if(isPrime(a)){
                    System.out.print(a + " ");
                }
            }

            scan.close();
        }
    }

    static int reverse(int x){
        int tmp, n=0;
        while(x > 0){
            tmp = x % 10;
            x = x/10;
            n = n*10 + tmp;
        }
        return n;
    }

    static boolean isPrime(int x){
        int tmp=0;
        for(int i=2; i<=x/2; i++){
            if(x%i == 0){
                tmp=1;
                break;
            }
        }
        if(tmp == 1){
            return false;
        }
        else{
            return true;
        }
    }
}
