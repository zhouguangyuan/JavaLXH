package ch3.sec4;
/** 
 * @author 作者 Kevin Zhou 
 * @version 创建时间：2020年4月23日 上午10:10:48 
 * 类说明 :一元运算符
 * 对于大部份的运算符而言，运算符的前后都会有操作数。
 * 但是有一种运算符较特殊，它只需要一个操作数，称为
 * 一元运算符。例如：正、负、非
 */
public class OperatorDemo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean b = false;
		
		int x = 10;
		int y = -30;
		
		System.out.println("b = " + b + ", !b = " + !b);
		System.out.println("x = " + x + ", -x = " + -x);
		System.out.println("y = " + y + ", +y = " + +y);
		

	}

}

/*
b = false, !b = true
x = 10, -x = -10
y = -30, +y = -30
 */

