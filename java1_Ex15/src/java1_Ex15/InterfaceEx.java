package java1_Ex15;
//인터페이스 : 상수와 메소드 선언의 집합
//	-동일한 목적 하에 동일 기능을 수행하도록 강제하는것
//	-다형성 극대화해 코드 수정 줄이고 프로그램 유지보수성 향상위함
//	-모든 메소드는 abstract 키워드 없이도 추상 메소드로 선언됨

interface PhoneInterface{//인터페이스 선언
	final int TIMEOUT = 1000;	//final : 엔티티를 한번만 할당, 값 변경 불가
	void sendCall();
	void receiveCall();
	default void printLogo() {
		System.out.println("** Phone **");
	};
}

class SamsungPhone implements PhoneInterface{//일반 클래스에서 인터페이스 구현
	@Override 
	public void sendCall() {
		System.out.println("Ring-ring-ring");
	}
	@Override
	public void receiveCall() {
		System.out.println("You got a call");
	}
	public void flash() {
		System.out.println("Light is on");
	}
}

public class InterfaceEx {
	public static void main(String[] args) {
		SamsungPhone phone = new SamsungPhone();
		phone.printLogo();
		phone.sendCall();
		phone.receiveCall();
		phone.flash();
	}
}
