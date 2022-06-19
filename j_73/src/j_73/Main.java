package j_73;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a;
		PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());
		
		while(true) {
			a = scan.nextInt();
			if(a == -1)
				break;
			if(a == 0) {
				if(pQ.isEmpty())
					System.out.println("-1");
				else {
					System.out.println(pQ.poll());
				}
			}else {
				pQ.add(a);
			}
		}
		
		scan.close();
	}
}
