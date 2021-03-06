package ch5.sec14;

/**
 * @author Kelvin
 * @version 2020年8月29日 下午4:36:42
 * @class instruction
 */

class Outer2 {
	private String info = "Hello world!";

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public void fun() {
	}
}

class Inner {
	Outer2 out = null;

	public Inner(Outer2 out) {
		this.out = out;
	}

	public void print(Outer2 out) {
		System.out.println(out.getInfo());
	}
}

public class InnerClassDemo02 {
	public static void main(String[] args) {
		Outer2 out = new Outer2();
		Inner in = new Inner(out);
		in.print(out);
	}
}
