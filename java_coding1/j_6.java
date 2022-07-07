import java.util.Scanner;

public class j_6 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String str = scan.next();
        char[] a = str.toCharArray();
        
        int res=0;
        for(int i=0; i<a.length; i++){
            if(a[i] >= 48 && a[i] <= 57){
                res = res*10 + (a[i]-48);
            }
        }

        System.out.println(res);

        int cnt =0;
        for(int i=1; i<=res; i++){
            if(res % i == 0)
                cnt++;
        }

        System.out.println(cnt);
        

        scan.close();
    }
}
