package ch3.sec4;
/** 
 * @author 作者 Kevin Zhou 
 * @version 创建时间：2020年4月24日 上午9:07:15 
 * 类说明 ：观察除数为0的情况
 */
public class OperatorDemo09 {
	public static void main(String[] args) {
		//定义变量
		int x = 10 / 0;
		//输出变量值，错误，除数为0。
		System.out.println(" x = " + x);
	}

}

/*
 * 造成以上问题的根本是除数为0
 */

/*
Exception in thread "main" java.lang.ArithmeticException: / by zero
at ch3.sec4.OperatorDemo09.main(OperatorDemo09.java:10)
*/