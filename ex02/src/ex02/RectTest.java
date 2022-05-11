package ex02;

//Object 클래스 연습

class Rect1{
	int w, h;
	public Rect1(int w, int h) {
		this.w = w;
		this.h = h;
	}
	public boolean equals(Object o) {
		Rect1 r = (Rect1)o;
		if(w == r.w && h == r.h) 
			return true;
		else if(w == r.h && h == r.w)
			return true;
		else 
			return false;
	}
	public String toString() {
		return "w=" + w + ", h=" + h;
	}
}

public class RectTest {
	public static void main(String[] args) {
		Rect1 a = new Rect1(2, 3);
		Rect1 b = new Rect1(3, 2);
		Rect1 c = new Rect1(1, 6);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
	}
}
