package ch5.sec8;

/**
 * @author Kelvin
 * @version 2020年8月19日 下午4:53:11
 * @class instruction
 */

class Demo {
	int temp = 30;
}

public class TestJava0538 {
	public static void main(String[] args) {
		Demo d1 = new Demo();
		d1.temp = 50;
		System.out.println("fun()方法调用之前：" + d1.temp);
		fun(d1);
		System.out.println("fun()方法调用之后：" + d1.temp);

	}

	public static void fun(Demo d2) {
		d2.temp = 1000;
	}

}
