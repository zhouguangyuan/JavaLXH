package ch5.sec8;

/**
 * @author Kelvin
 * @version 2020年8月19日 下午5:00:55
 * @class instruction
 */

class Demon {
	String temp = "Hello";

}

public class RefDemo03 {

	public static void main(String[] args) {
		
		Demon d1  = new Demon();
		d1.temp = "World";

		System.out.println("fun()方法调用之前：" + d1.temp);
		fun(d1);
		System.out.println("fun()方法调用之后：" + d1.temp);
		fun(d1);
	}

	public static void fun(Demon d2) {
		 d2.temp = "MLDN";

	}

}
