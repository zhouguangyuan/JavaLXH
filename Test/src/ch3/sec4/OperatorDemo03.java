package ch3.sec4;
/** 
 * @author 作者 Kevin Zhou 
 * @version 创建时间：2020年4月23日 上午10:21:48 
 * 类说明：算术运算符，即数学当中的加、减、乘、除法和
 * 取余数。 
 */
public class OperatorDemo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10;
		int j = 3;

		//加法运算
		System.out.println(i + " + " + j + " = " +( i + j ));
		//减法运算
		System.out.println(i + " - " + j + " = " +( i - j ));
		//乘法运 算
		System.out.println(i + " * " + j + " = " +( i * j ));
		//除法运算
		System.out.println(i + " / " + j + " = " +( i / j ));
		//取模（取余数）
		System.out.println(i + " % " + j + " = " +( i % j ));

	}

}

/*
 10 + 3 = 13
10 - 3 = 7
10 * 3 = 30
10 / 3 = 3
10 % 3 = 1
*/
