package ch4.kevin.com;

public class MethodDemo02 {

	public static void main(String[] args) {
		int one = addOne(10, 20);
		float two = addTwo(10.3f, 13.3f); 
		System.out.println("addOne的计算结果：" + one);
		System.out.println("addTwo的计算结果：" + two);
	}
	
	/*
	 * 定义方法，完成两个整数的加法操作，方法返回一个int型数据
	 * */
	public static int addOne( int x, int y) {
		/*
		 * 在方法中，可以定义多变量，称为局部变量，只在此方法中起作用
		 * */
		int temp = 0 ;   //temp为局部变量，只在此方法中起作用
		temp = x + y ;  //执行加法计算
		return temp;	//返回计算结果
	}
	
	/*
	 * 定义方法，完成两个浮点数的的加法操作，方法返回一个float型数据
	 * */
	public static float addTwo( float x, float y) {
		float temp = 0 ;   //temp为局部变量，只在此方法中起作用
		temp = x + y ;    //执行加法计算
		return temp;      //返回计算结果
	}

}
