package ch5.sec2;

import ch5.sec2.Person;

/**
 * @author Kelvin
 * @version 2020年8月7日 下午5:50:18
 * @class instruction
 */
public class ClassDemo02 {

	public static void main(String[] args) {
		Person per = new Person();
		per.setName("Kevin");
		per.setAge(30);
        System.out.println("Name:" + per.getName());
        System.out.println("Age:" + per.getAge());
        
	}

}
