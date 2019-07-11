package ch4.kevin.com;
/*
 * 数组动态初始化：采用先声明数组，然后再为数组中的每个内容赋值的方式。
 * 数组静态初始化：直接在声明时就给数组赋初值，在数组的声明格式后面使用大括号赋初值完成。
 * 不需要指明数组的长度，初值的个数即数组长度。声明和赋值必须同时进行，即不可先声明后赋值。
 * */

public class ArrayDemo04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int score [] = { 91, 92, 93, 94, 95, 96 };
		
		for( int x = 0; x < 6; x++)
		{
			System.out.println("score[" + x + "] = " + score[x]);
		}

	}

}
