package ch3.sec2;
/** 
 * @author 作者 Kevin Zhou 
 * @version 创建时间：2020年4月12日 下午3:26:45 
 * 类说明 
 */
public class DataDefaultValue {
	public static byte b;
	public static short s;
	public static int i;
	public static long l;
	public static float f;
	public static double d;
	public static char ch;
	public static boolean bool;

	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		
		
		System.out.println("b = " + b);
		System.out.println("s = " + s);
		System.out.println("i = " + i);
		System.out.println("l = " + l);
		System.out.println("f = " + f);
		System.out.println("d = " + d);
		System.out.println("ch = " + ch);
		System.out.println("bool = " + bool);

	}

}

/*
  
b = 0
s = 0
i = 0
l = 0
f = 0.0 (书本上写的是0.0f)此处的f只是表明该值是一个float类型，电脑输出实为0.0
d = 0.0 (书本上写的是0.0d)同上一行解释
ch = 
bool = false
 */
 
