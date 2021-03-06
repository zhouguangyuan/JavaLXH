package ch5.sec10;

/**
 * @author Kelvin
 * @version 2020年8月22日 下午8:15:27
 * @class instruction
 */
class Person {
	String name;
	int age;
	static String country = "A city";

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getInfo() {
		return "Name：" + this.getName() + "; Age：" + this.getAge() + "; City:"
				+ this.getCountry();
	}
}

public class StaticDemo01 {
	public static void main(String[] args) {
		Person per1 = new Person("Zhangsan", 20);
		Person per2 = new Person("lisi", 23);
		Person per3 = new Person("wanger", 26);
		
		System.out.println(per1.getInfo());
		System.out.println(per2.getInfo());
		System.out.println(per3.getInfo());
	}

}
