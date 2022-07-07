import java.util.Scanner;

public class j_23 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int num, max=0, tmp, sum=0;
        num = scan.nextInt();
        tmp = num;
        for(int i=1; i<n; i++){
            num = scan.nextInt();
            if(tmp <= num){
                sum++;
            }else{
                if(max < sum)
                    max = sum;
                sum = 0;
            }
            tmp = num;
        }

        if(max < sum)
            max = sum;
        
        System.out.println(max+1);

        scan.close();
    }
}
