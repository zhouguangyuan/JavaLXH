package ch3.sec4;

/**
 * @author 作者 Kevin Zhou
 * @version 创建时间：2020年4月24日 上午9:14:11 
 * 类说明：验证&的作用（非短路与）
 */
public class OperatorDemo10 {
	public static void main(String[] args) {
		if (10 != 10 & 10 / 0 == 0) {
			System.out.println("条件满足");
		}
	}
}


/*
Exception in thread "main" java.lang.ArithmeticException: / by zero
at ch3.sec4.OperatorDemo10.main(OperatorDemo10.java:10)

*/