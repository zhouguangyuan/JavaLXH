package ch5.sec5;

/**
 * @author Kelvin
 * @version 2020年8月17日 下午3:12:00
 * @class instruction
 */
class Person {
	String name;
	int age;

	public Person() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

public class NonameDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
