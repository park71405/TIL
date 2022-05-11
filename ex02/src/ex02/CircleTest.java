package ex02;

class Circle{
	int x, y, r;
	public Circle(int x, int y, int r) {
		this.x = x;
		this.y = y;
		this.r = r;
	}
	public boolean equals(Object obj) {
		Circle c = (Circle)obj;
		if(c.x == x && c.y == y && c.r == r) {
			return true;
		}
		else
			return false;
	}
	public String toString() {
		return "(" + x + "," + y + ") r=" + r;
	}
}

public class CircleTest {
	public static void main(String[] args) {
		Circle a = new Circle(2, 3, 5);
		Circle b = new Circle(1, 3, 5);
		Circle c = new Circle(2, 3, 5);
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
	}
}
