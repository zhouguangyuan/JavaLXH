package ch3.sec5;

/**
 * @author Kelvin
 * @version 2020年4月27日 下午2:58:23
 * @class instruction
 * 一、For循环语句
 * 二、在循环语句中定义的语句
 */
public class ForDemo {
	public static void main(String[] args) {
		int sum = 0;

		for (int x = 1; x <= 10; x++) {
			sum += x;
		}
		System.out.println("sum is " + sum);

	}
}
