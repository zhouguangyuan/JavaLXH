package ch3.sec4;
/** 
 * @author 作者 Kevin Zhou 
 * @version 创建时间：2020年4月23日 上午10:56:00 
 * 类说明 :自增与自减运算符。
 * 一、先执行，后自增或者自减。
 * 二、后自增或者自减，后执行。
 * 以上两种情况，不管是哪一种完成操作后变量的值都
 * 会自动增一或减一。
 * 
 */
public class OperatorDemo06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//定义整型变量a和b
		int a = 3 , b = 3;
		
		//输出变量a的值
		System.out.println("a = " + a );
		//先执行，后自增
		System.out.println("\t a++ = " + a++ + ", a = " + a );
		//输出变量b的值
		System.out.println("b = " + b );
		//先自增，后执行
		System.out.println("\t ++b = " + ++b + ", b = " + b );

		
		//定义整型变量x和y
		int  x = 6, y = 6; 
		
		//输出变量x的值
		System.out.println("x = " + x );
		//先执行，后自增
		System.out.println("\t x-- = " + x-- + ", x = " + x );
		//输出变量y的值
		System.out.println("y = " + y );
		//先自增，后执行
		System.out.println("\t --y = " + --y + ", y = " + y );
		
		
	}

}

/*
a = 3
	 a++ = 3, a = 4
b = 3
	 ++b = 4, b = 4
x = 6
	 x-- = 6, x = 5
y = 6
	 --y = 5, y = 5
*/
