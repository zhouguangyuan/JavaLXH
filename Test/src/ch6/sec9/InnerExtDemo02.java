/**
 * InnerExtDemo02.java
 *2020年10月5日
 *下午7:31:54
 *@author Kelvin
 */
package ch6.sec9;

/**
 * @author Administrator
 *
 */

interface A {
	public abstract void printA();
	
	abstract class B {
		public abstract void printB();
	}
}

class X implements A {
	public void printA(){
		System.out.println("Hello - > A");
	}
	
	class Y extends B {
		public void printB(){
			System.out.println("Hello - > B");
		}
	}
}
public class InnerExtDemo02 {
   public static void main(String[] args) {
	A.B b = new X().new Y();
	b.printB();
}
}
