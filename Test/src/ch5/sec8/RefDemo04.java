package ch5.sec8;

/**
 * @author Kelvin
 * @version 2020年8月19日 下午5:00:55
 * @class instruction
 * 接收本类的引用
 */

class Demons {
	private int temp = 30;

	public void fun(Demons d2) {
		d2.temp = 50; //对象在类的内部直接调用本类的私有属情
	}

	public int getTemp() {
		return temp;
	}

	public void setTemp(int temp) {
		this.temp = temp;
	}
}

public class RefDemo04 {

	public static void main(String[] args) {

		Demons d1 = new Demons();
		System.out.println("fun()方法调用之前：" + d1.getTemp());
		d1.fun(d1);

		System.out.println("fun()方法调用之后：" + d1.getTemp());
	}

	public static void fun(Demon d2) {
		d2.temp = "MLDN";

	}

}
