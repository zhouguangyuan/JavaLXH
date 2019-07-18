package ch4.kevin.com;

/**
 * 
 * @author Kevin Zhou
 *
 */
public class MethodDemo03 {

	public static void main(String[] args) {
		int one = add(10, 20);
		int two = add( 10, 20, 30);
		float three = add(10.3f, 13.3f, 12.5f); 
		System.out.println("addOne的计算结果：" + one);
		System.out.println("addTwo的计算结果：" + two);
	}
	
	/*
	 * 定义方法，完成两个整数的加法操作，方法返回一个int型数据
	 * */
	public static int add( int x, int y) {
		/*
		 * 在方法中，可以定义多变量，称为局部变量，只在此方法中起作用
		 * */
		int temp = 0 ;   //temp为局部变量，只在此方法中起作用
		temp = x + y ;  //执行加法计算
		return temp;	//返回计算结果
	}
	
	/*
	 * 定义方法，完成叁个整数的加法操作，方法返回一个int型数据
	 * */
	public static int add( int x, int y, int z) {
		/*
		 * 在方法中，可以定义多变量，称为局部变量，只在此方法中起作用
		 * */
		int temp = 0 ;   //temp为局部变量，只在此方法中起作用
		temp = x + y + z;  //执行加法计算
		return temp;	//返回计算结果
	}
	
	/*
	 * 定义方法，完成叁个浮点数的加法操作，方法返回一个float型数据
	 * */
	public static float add( float x, float y, float z) {
		/*
		 * 在方法中，可以定义多变量，称为局部变量，只在此方法中起作用
		 * */
		float temp = 0 ;   //temp为局部变量，只在此方法中起作用
		temp = x + y + z;  //执行加法计算
		return temp;	//返回计算结果
	}
	


}
