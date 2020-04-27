package ch3.sec5;

/**
 * @author 作者 Kelvin
 * @version 创建时间：2020年4月27日 上午11:27:20
 * @类说明:三种条件语句的格式
 */
public class IfElseIfElseDemo {
	public static void main(String[] args) {
		if (true) {
			System.out.println("第一种格式");
		}

		if (false) {
			System.out.println("???");
		} else {
			System.out.println("第二种格式");
		}

		int num = 3;
		if (num == 1) {
			System.out.println("???");
		} else if (num == 2) {
			System.out.println("???");
		} else {
			System.out.println("第三种格式");
		}
	}
}
