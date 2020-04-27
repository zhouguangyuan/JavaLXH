package ch3.sec5;

/**
 * @author Kelvin
 * @version 2020年4月27日 上午11:33:58
 * @class instruction
 */
public class MinDemo {
	public static void main(String[] args) {
		int min = 0;
		int x = 10, y = 3;
		min = x > y ? y : x;
		System.out.println("Min is " + min);
	}
}
