import java.util.Scanner;

public class j_7 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();
        str = str.replaceAll(" ", "");
        str = str.toLowerCase();

        System.out.println(str);

        scan.close();
    }
}
