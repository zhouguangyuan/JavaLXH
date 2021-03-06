package ch3.se3;
/** 
 * @author 作者 Kevin Zhou 
 * @version 创建时间：2020年4月21日 下午3:00:14 
 * 类说明 
 * 数据的强制类型转换
 */
public class DataDemo11 {
	public static void main(String []args){
		float f = 30.3f;   //定义浮点型变量
		int x = (int)f;		//强制转换成整型
		f = 2.4f;   //并不影响原来所定义的数据类型，此处f变量仍然是float类型
		System.out.println("x = " + x);   //输出转换后的整型结果，舍去了小数部份
		System.out.println("f = " + f);  //输出float类型的f变量值
		System.out.println("10 / 3 =" + 10/3);
		System.out.println("10 / 3 =" + (float)10/3);  //常量计算使用强制类型转换
		System.out.println("10 / 3 =" + (double)10/3);  //常量计算使用强制类型转换
	}

}
