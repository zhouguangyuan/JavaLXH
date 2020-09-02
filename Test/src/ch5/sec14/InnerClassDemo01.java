package ch5.sec14;
/** 
 * @author Kelvin 
 * @version 2020年8月29日 下午4:36:42 
 * @class instruction 
 */

class Outer {
	private String info = "Hello world!";
	
	class Inner {
		public void print(){
			System.out.println(info);
		}
	}
	
	public void fun(){
		new Inner().print();
	}
}
public class InnerClassDemo01 {
	public static void main(String[] args) {
		Outer out = new Outer();
		Outer.Inner in = out.new Inner();   //在外部访问内部类
	}
}
