package java1_Ex15;
//추상클래스: 하나 이상의 추상 메소드를 포함하는 클래스
//	-추상 메소드가 포함되었으면 클래스도 추상 클래스임, abstract 붙여야함
//	-추상 클래스 자체로는 클래스 역할 수행 불가, 객체 생성 불가
//	-추상 클래스를 상속받는 자식 클래스는 추상 메소드의 구체적 본체 가질수 있음
//	-추상 메소드의 접근 지정자로 private 사용 불가
// 	-추상 클래스를 상속받은 자식 클래스에서 추상 메소드를 구현하지 않으면 자식 클래스도 추상 클래스가 되어야함

abstract class Calculator{
	public abstract int add(int a, int b);
	public abstract int subtract(int a, int b);
	public abstract double average(int[] a);
}

public class GoodCalc extends Calculator{
	@Override
	public int add(int a, int b) {
		return a + b;
	}
	@Override
	public int subtract(int a, int b) {
		return a - b;
	}
	@Override
	public double average(int[] a) {
		double sum = 0;
		for(int i=0; i<a.length; i++)
			sum += a[i];
		return sum / a.length;
	}
	
	public static void main(String[] args) {
		GoodCalc c = new GoodCalc();
		System.out.println(c.add(2, 3));
		System.out.println(c.subtract(2, 3));
		System.out.println(c.average(new int[] {2,3,4}));
	}
}
