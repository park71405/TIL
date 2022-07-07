import java.util.Scanner;

public class j_5 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String str = scan.next();
        char[] a = str.toCharArray();
        
        int year, age;
        if(a[7] == '1' || a[7] == '2'){
            year = 1900 + ((a[0]-48)*10 + (a[1]-48));
        }else{
            year = 2000 + ((a[0]-48)*10 + (a[1]-48));
        }
        age = 2022 - year + 1;
        System.out.print(age + " ");

        if(a[7] == '1' || a[7] == '3')
            System.out.println("M");
        else{
            System.out.println("W");
        }

        scan.close();
    }
}
