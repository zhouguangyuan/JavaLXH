package ch6.sec8;

/**
 * @author Kelvin
 * @version 2020年9月18日 上午10:45:55
 * @class instruction
 */
/*class A {
	public void fun1() {
		System.out.println("A--> public void fun1(){}");
	}

	public void fun2() {
		this.fun1();
	}
}

class B extends A {
	public void fun1() {
		System.out.println("B--> public void fun1(){}");
	}

	public void fun3() {
		System.out.println("B--> public void fun3(){}");
	}
}*/

public class InstanceofDemo01 {
	public static void main(String[] args) {
		A a1 = new B();
		System.out.println("A a1 = new B(); " + (a1 instanceof A));
		System.out.println("A a1 = new B(); " + (a1 instanceof B));
		A a2 = new A();
		System.out.println("A a2 = new B(); " + (a2 instanceof A));
		System.out.println("A a2 = new B(); " + (a2 instanceof B));

	}
}
