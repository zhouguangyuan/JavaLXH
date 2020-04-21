package ch3.se3;
/** 
 * @author 作者 Kevin Zhou 
 * @version 创建时间：2020年4月12日 下午3:48:27 
 * 类说明 
 * 
 */
public class DataDemo08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 30;
		float y = 22.19f;
		System.out.println("x/y = " + (x/y));
		System.out.println("10/3.5 = " + (10/3.5));
		System.out.println("3.5/10 = " + (3.5/10));
		System.out.println("3.5/3 = " + (3.5/3));
		System.out.println("10/3 = " + (10/3));
		System.out.println("10.0/3 = " + (10.0/3));

	}

}

/*
x/y = 1.3519603 (此为float类型的数据输出，精确度为8位）
10/3.5 = 2.857142857142857 （此为double类型的数据输出，精确度为16位）
3.5/10 = 0.35 (由于可以除尽，所以小数部份只有两位，但是它仍然是一个double类型的数据）
3.5/3 = 1.1666666666666667 （此为double类型的数据输出，精确度为16位）
10/3 = 3 （两个int类型数据相除，取整舍余数，数据精度丢失）
10.0/3 = 3.3333333333333335 （数据类型自动提升为double类型）
*/