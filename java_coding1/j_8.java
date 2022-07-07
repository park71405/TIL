import java.util.Scanner;
import java.util.Stack;

public class j_8 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String str = scan.next();
        char[] a = str.toCharArray();
        Stack<String> stack = new Stack<>();

        for(int i=0; i<a.length; i++){
            if(a[i] == '('){
                stack.push("(");
            }else{
                if(stack.empty()){
                    System.out.println("NO");
                    System.exit(0);
                }
                stack.pop();
            }
        }

        if(stack.empty())
            System.out.println("YES");
        else
            System.out.println("NO");

        scan.close();
    }
}
