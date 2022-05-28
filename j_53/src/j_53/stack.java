package j_53;

import java.util.Scanner;
import java.util.Stack;

public class stack {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int k = scan.nextInt();
		
		Stack<Integer> stack = new Stack<>();
		
		while(n>0) {
			stack.push(n % k);
			n = n / k;
		}
		
		while(!stack.empty()) {
			System.out.print(stack.pop());
		}
		
		scan.close();
	}
}
