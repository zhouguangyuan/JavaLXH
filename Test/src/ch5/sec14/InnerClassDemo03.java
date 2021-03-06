package ch5.sec14;

/**
 * @author Kelvin
 * @version 2020年8月29日 下午4:36:42
 * @class instruction
 */

class Outer3 {
	private String info = "Hello world!";
	
	public String getInfo(){
		return info;
	}

	public void fun() {
		new Inner3(this).print();
	}
}

class Inner3 {
	Outer3 out = null;

	public Inner3(Outer3 out) {
		this.out = out;
	}

	public void print() {
		System.out.println(out.getInfo());
	}
}

public class InnerClassDemo03 {
	public static void main(String[] args) {
		new Outer3().fun();
	}
}
