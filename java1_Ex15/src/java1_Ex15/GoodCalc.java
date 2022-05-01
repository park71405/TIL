package java1_Ex15;
//�߻�Ŭ����: �ϳ� �̻��� �߻� �޼ҵ带 �����ϴ� Ŭ����
//	-�߻� �޼ҵ尡 ���ԵǾ����� Ŭ������ �߻� Ŭ������, abstract �ٿ�����
//	-�߻� Ŭ���� ��ü�δ� Ŭ���� ���� ���� �Ұ�, ��ü ���� �Ұ�
//	-�߻� Ŭ������ ��ӹ޴� �ڽ� Ŭ������ �߻� �޼ҵ��� ��ü�� ��ü ������ ����
//	-�߻� �޼ҵ��� ���� �����ڷ� private ��� �Ұ�
// 	-�߻� Ŭ������ ��ӹ��� �ڽ� Ŭ�������� �߻� �޼ҵ带 �������� ������ �ڽ� Ŭ������ �߻� Ŭ������ �Ǿ����

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
