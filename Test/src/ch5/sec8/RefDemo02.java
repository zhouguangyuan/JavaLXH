package ch5.sec8;

/**
 * @author Kelvin
 * @version 2020年8月19日 下午5:00:55
 * @class instruction
 */
public class RefDemo02 {
	public static void main(String[] args) {
		String str1 = "Hello World!";

		System.out.println("fun()方法调用之前：" + str1);
		fun(str1);
		System.out.println("fun()方法调用之后：" + str1);
	}

	public static void fun(String str2) {
		str2 = "MLDN";

	}

}
