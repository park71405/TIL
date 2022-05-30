package j_55;

import java.util.Scanner;
import java.util.Stack;

public class stack {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] a = new int[n+1];
		Stack<Integer> stack = new Stack<>();
		String str = new String();
		int i, j=1;
		
		for(i=1; i<=n; i++) {
			a[i] = scan.nextInt();
			stack.push(a[i]);
			str = str.concat("P");
			while(true) {
				if(stack.empty())
					break;
				if(j == stack.peek()) {
					stack.pop();
					j++;
					str = str.concat("O");
				}
				else
					break;
			}
		}
		
		if(!stack.empty()) {
			System.out.println("impossible");
		}
		else {
			System.out.println(str);
		}
		
		
		scan.close();
	}
}
