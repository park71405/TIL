package j_74;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		PriorityQueue<Integer> pQ = new PriorityQueue<>();
		
		int a;
		while(true) {
			a = scan.nextInt();
			if(a == -1)
				break;
			if(a == 0) {
				if(pQ.isEmpty()) {
					System.out.println(-1);
					break;
				}else {
					System.out.println(pQ.poll());
				}
			}else {
				pQ.add(a);
			}
		}
		
		scan.close();
	}
}
