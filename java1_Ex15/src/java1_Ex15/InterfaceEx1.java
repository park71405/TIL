package java1_Ex15;

interface PhoneInterface1{
	final int TIMEOUT = 1000;
	void sendCall();
	void receiveCall();
	default void printLogo() {
		System.out.println("** Phone **");
	};
}

interface MobilePhoneInterface extends PhoneInterface1{
	void sendSMS();
	void receiveSMS();
}

interface MP3Interface {
	public void play();
	public void stop();
}

class PDA {
	public int calculate(int x, int y) {
		return x + y;
	}
}

class SmartPhone extends PDA implements MobilePhoneInterface, MP3Interface{
	@Override
	public void sendCall() {
		System.out.println("Ring-ring-ring");
	}
	@Override
	public void receiveCall() {
		System.out.println("You got a call");
	}
	@Override
	public void sendSMS() {
		System.out.println("Sending a text");
	}
	@Override
	public void receiveSMS() {
		System.out.println("You got a text");
	}
	@Override 
	public void play() {
		System.out.println("Playing musinc");
	}
	@Override
	public void stop() {
		System.out.println("Stop playing");
	}
	public void schedule() {
		System.out.println("Make a schedule");
	}
}

public class InterfaceEx1 {
	public static void main(String[] args) {
		SmartPhone phone = new SmartPhone();
		phone.printLogo();
		phone.sendCall();
		phone.play();
		System.out.println("3 + 5 = " + phone.calculate(3, 5));
		phone.schedule();
	}
}
