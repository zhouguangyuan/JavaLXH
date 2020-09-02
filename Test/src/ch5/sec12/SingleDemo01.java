package ch5.sec12;

/**
 * @author Kelvin
 * @version 2020年8月28日 下午3:58:19
 * @class instruction
 */

class Singleton {
	private static Singleton instance = new Singleton();

	private Singleton() {

	}

	public void print() {
		System.out.println("Hello world!");
	}

	public static Singleton getInstance() {
		return instance;
	}

	public static void setInstance(Singleton instance) {
		Singleton.instance = instance;
	}

}

public class SingleDemo01 {
	public static void main(String[] args) {
		Singleton s1 = null;
		s1 = Singleton.getInstance();
		s1.print();
	}
}
