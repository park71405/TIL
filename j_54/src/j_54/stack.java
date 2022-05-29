package j_54;

import java.util.Scanner;
import java.util.Stack;

public class stack {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String str = new String();
		str = scan.next();
		
		int len = str.length();
		Stack<Character> stack = new Stack<>();
		int tmp = 1;
		
		for(int i=0; i<len; i++) {
			if(str.charAt(i) == '(') {
				stack.push(str.charAt(i));
			}else {
				if(stack.empty()) {
					tmp = 0;
					break;
				}
				stack.pop();
			}
		}
		
		if(stack.empty() && tmp == 1) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
		
		scan.close();
	}
}
