package ch6.sec9;

/**
 * @author Kelvin
 * @version 2020年9月22日 下午4:21:25
 * @class instruction
 */

interface USB {
	public void start();

	public void stop();
}

class Computer {
	public static void plugin(USB usb) {
		usb.start();
		System.out.println("The device is working!");
		usb.stop();
	}
}

class Flush implements USB {
	public void start() {
		System.out.println("The Flush is started!");
	}

	public void stop() {
		System.out.println("The Flush is stopped!");
	}
}

class Print implements USB {
	public void start() {
		System.out.println("The print device is started!");
	}

	public void stop() {
		System.out.println("The print device is stopped!");
	}
}

public class InterfaceCaseDemo02 {
	public static void main(String[] args) {
		Computer.plugin(new Flush());
		Computer.plugin(new Print());

	}
}
