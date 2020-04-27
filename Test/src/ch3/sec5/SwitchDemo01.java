package ch3.sec5;

/**
 * @author Kelvin
 * @version 2020年4月27日 上午11:48:40
 * @class instruction
 */
public class SwitchDemo01 {
	public static void main(String[] args) {
		int x = 3;
		int y = 6;
		char oper = '/';

		switch (oper) {
		case '+':
			System.out.println("x + y = " + (x + y));
			break;
		case '-':
			System.out.println("x - y = " + (x - y));
			break;
		case '*':
			System.out.println("x * y = " + (x * y));
			break;
		case '/':
			System.out.println("x / y = " + (x / y));
			break;

		default:
			System.out.println("未知的操作！");
			break;
		}
	}
}
