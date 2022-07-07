import java.util.*;

public class j_3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int sum =0;
        for(int i=1; i<n/2; i++){
            if(n % i == 0){
                sum += i;
                System.out.print(i + " + ");
            }
        }
        sum += n/2;
        System.out.println(n/2 + " = " + sum);

        scan.close();
    }
}
