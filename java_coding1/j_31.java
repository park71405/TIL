import java.util.Scanner;

public class j_31 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();

        int c=0, h=0, pos, i;
        if(str.charAt(1) == 'H'){
            c = 1;
            if(str.charAt(2) == '\0')
                h = 1;
            else{
                h = str.charAt(2)-48;
            }
        }else{
            c = str.charAt(1)-48;
            if(str.charAt(3) == '\0')
                h=1;
            else{
                h = str.charAt(3)-48;
            }
        }
        int sum = c*12 + h;
        System.out.println(sum);

        scan.close();
    }
}
