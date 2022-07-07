import java.util.Scanner;

public class j_2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();

        int sum = 0;
        for(int i=a; i<b; i++){
            sum += i;
            System.out.print(i + " + ");
        }
        sum += b;
        System.out.println(b + " = " + sum);

        scan.close();
    }
}