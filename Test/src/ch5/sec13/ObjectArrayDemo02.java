package ch5.sec13;

/**
 * @author Kelvin
 * @version 2020年8月28日 下午4:37:08
 * @class instruction
 */
public class ObjectArrayDemo02 {
	public static void main(String[] args) {
		Person per[] = new Person[3];

		for (int i = 0; i < per.length; i++) {
			System.out.println(per[i]);
		}
		per[0] = new Person("Zhangsan");
		per[1] =new Person("lisi");
		per[2] = new Person("wanger");
		
		for (int i = 0; i < per.length; i++) {
			System.out.println(per[i].getName());
		}

	}
}
