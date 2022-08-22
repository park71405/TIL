import java.util.Scanner;

public class j_41 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int cnt=0, tmp, i;
        tmp = n;
        n--;
        int b=1;

        while(n > 0){
            b++;
            n = n - b;
            if(n%b == 0){
                for(i=1; i<b; i++){
                    System.out.print((n/b)+i + " + ");
                }
                System.out.println((n/b)+i + " = " + tmp);
                cnt++;
            }
        }
        System.out.print(cnt);

    }
}
