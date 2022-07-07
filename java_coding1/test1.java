import java.util.Scanner;

public class test1{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
    
        String str = scan.nextLine();
        str = str.toUpperCase();
        System.out.println(str);

        scan.close();
    }
}