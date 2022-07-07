import java.util.Scanner;

public class j_16 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
    
        String str1 = scan.next();
        String str2 = scan.next();

        char[] a = str1.toCharArray();
        char[] b = str2.toCharArray();

        for(int i=0; i<a.length; i++){
            for(int j=0; j<b.length; j++){
                if(a[i] == b[j]){
                    b[j] = 92;
                }
            }
        }

        String tmp = "YES";
        for(int j=0; j<b.length; j++){
            if(b[j] != 92){
                tmp = "NO";
            }
        }

        System.out.println(tmp);

        scan.close();
    }
}
