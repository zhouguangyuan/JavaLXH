package ch5.sec15;

/**
 * @author Kelvin
 * @version 2020年8月30日 下午4:23:28
 * @class instruction
 */

class Outer {
	private static String info = "Hello world!";

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public void fun() {
		new Inner().print();
	}

	static class Inner {
		public void print() {
			System.out.println(info);
		}
	}

}

public class InnerClassDemo01 {
	public static void main(String[] args) {
		Outer out = new Outer();
		Outer.Inner in = new Outer.Inner();
	}
}
