package ch5.sec9;

/**
 * @author Kelvin
 * @version 2020年8月22日 下午7:42:16
 * @class instruction
 */
public class ThisDemo07 {

	public static void main(String[] args) {
		Person per1 = new Person("张三", 24);
		Person per2 = new Person("张三", 25);
		if (per1.getName() == per2.getName() && per1.getAge() == per2.getAge()) {
			System.out.println("The two object are eqaul.");
		} else {
			System.out.println("The two object are not eqaul.");
		}

		if (per1.compare(per2)) {
			System.out.println("The two object are eqaul.");
		} else {
			System.out.println("The two object are not eqaul.");
		}
	}
}
