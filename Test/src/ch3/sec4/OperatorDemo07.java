package ch3.sec4;
/** 
 * @author 作者 Kevin Zhou 
 * @version 创建时间：2020年4月23日 上午11:22:33 
 * 类说明 
 */
public class OperatorDemo07 {
	public static void main(String[] args) {
		//定义boolean变量
		boolean a = true;
		boolean b = false;
		
		//执行与操作
		System.out.println(" a && b " + ( a && b));
		//执行与操作
		System.out.println(" a & b " + ( a & b));
		//执行或操作
		System.out.println(" a || b " + ( a | b));
		//执行或操作
		System.out.println(" a | b " + ( a | b));
	}

}

/*
a && b false
a & b false
a || b true
a | b true
*/