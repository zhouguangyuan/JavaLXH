package ch3.sec5;

/**
 * @author Kelvin
 * @version 2020年4月27日 下午2:58:23
 * @class instruction
 */
public class ForDemo {
	public static void main(String[] args) {
		int x = 1;
		int sum = 0;

		for ( x = 1; x <= 100; x++) {
			sum += x;
		}
		System.out.println("sum is " + sum);

	}
}
