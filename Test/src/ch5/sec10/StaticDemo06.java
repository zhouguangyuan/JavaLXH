package ch5.sec10;

/**
 * @author Kelvin
 * @version 2020年8月22日 下午8:15:27
 * @class instruction
 */
class Demo {
	static int count = 0;

	public Demo() {
		count++;
		System.out.println("General the " + count + " Object");

	}
}

public class StaticDemo06 {
	public static void main(String[] args) {
	   new Demo();
	   new Demo();
	   new Demo();
	   new Demo();

	}

}
