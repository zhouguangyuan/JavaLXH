package ch3.sec5;

/**
 * @author Kelvin
 * @version 2020年4月27日 上午11:48:40
 * @class instruction
 /*从如下程序可以发现，在每一个case语句之后
  * 都加上一个break语句，如果不加入此语句，
  * 则switch语句会从第一个满足条件的case开
  * 始依次执行操作，如下面的测试代码
  */
 
public class SwitchDemo02 {
	public static void main(String[] args) {
		int x = 3;
		int y = 6;
		char oper = '+';

		switch (oper) {
		case '+':
			System.out.println("x + y = " + (x + y));
		case '-':
			System.out.println("x - y = " + (x - y));
		case '*':
			System.out.println("x * y = " + (x * y));
		case '/':
			System.out.println("x / y = " + (x / y));

		default:
			System.out.println("未知的操作！");
		}
	}
}

