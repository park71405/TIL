package j_75;

import java.util.*;

class Data implements Comparable<Data>{
	int money;
	int when;
	
	public Data(int a, int b){
		money = a;
		when = b;
	}
	
	@Override
	public int compareTo(Data b) {
		return b.when - this.when;
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		int n = scan.nextInt();
		Data[] a = new Data[n];
		int max = -217000000;
		
		for(int i=0; i<n; i++) {
			int x = scan.nextInt();
			int y = scan.nextInt();
			if(max < y)
				max = y;
			a[i] = new Data(x, y);
		}
		
		Arrays.sort(a);
		
		PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());
		
		int sum =0;
		int j = 0;
		for(int i=max; i>0; i--) {
			for( ; j<n; j++) {
				if(a[j].when < i) {
					break;
				}
				pQ.add(a[j].money);
			}
			if(pQ.size() != 0) {
				sum += pQ.poll();
			}
		}
		System.out.println(sum);
		
		scan.close();
	}
}
