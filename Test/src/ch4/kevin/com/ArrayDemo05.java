package ch4.kevin.com;
/*
 * 数组动态初始化：采用先声明数组，然后再为数组开辟内存空间，最后为数组中的每个内容赋值的方式。
 * 数组静态初始化：直接在声明时就给数组赋初值，在数组的声明格式后面使用大括号赋初值完成。
 * 不需要指明数组的长度，初值的个数即数组长度。声明和赋值必须同时进行，即不可先声明后赋值。
 *
 * 求出数组中的最大值和最小值
 * */

public class ArrayDemo05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int score [] = { 91, 92, 93, 94, 95, 96 }; //使用静态初始化声明数组

		int max = 0;
		int min = 0;

		max = min = score[0];

		for( int x = 0; x < score.length; x++)   //循环输出
		{
			if(score[x] > max){
				max = score[x];
			}
			if(score[x] < min){
				min = score[x];
			}
		}
		System.out.println("最高成缚" + max);  //输出最大值
		System.out.println("最低成缚" + min);	//输出最小值

	}

}
