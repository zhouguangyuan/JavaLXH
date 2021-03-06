package ch3.sec5;

/**
 * @author Kelvin
 * @version 2020年4月27日 下午2:40:03
 * @class instruction
 *一、 do...while与while循环不同的是do...while操作
 * 中就算条件不满足，也会至少执行一次。而while如
 * 果条件不满足，则一次也不会被执行。
 * 二、事先不知道循环该执行多少次。
 */
public class DoWhileDemo {
	public static void main(String[] args) {
		int x = 1;
		int sum = 0;

		do {
			sum += x;
			x++;
		} while (x <= 10);
		
		System.out.println("sum is " + sum);
	}
}
