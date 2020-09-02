package ch5.sec14;

/**
 * @author Kelvin
 * @version 2020年9月1日 下午3:32:12
 * @class instruction
 */

class Outer4 {
	private String info = "Hello world!";

	public void fun(final int temp) {
		class Inner {
             public void print(){
            	 System.out.println(temp);
            	 System.out.println(info);
             }
		};
		new Inner().print();
	}
}

public class InnerClassDemo05 {
	public static void main(String[] args) {
		new Outer4().fun(30);
	}
}
