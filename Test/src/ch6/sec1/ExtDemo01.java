package ch6.sec1;

/**
 * @author Kelvin
 * @version 2020年9月3日 下午3:45:41
 * @class instruction
 */
class Person {
	String name;
	int age;
	String sex;

	public Person() {
	}

	public Person(String name, String sex, int age) {
		this.name = name;
		this.sex = sex;
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

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

}

class Student extends Person {
	String school;

	public Student(String name, String sex, int age){
		super(name, sex, age);
	}
	
	public Student(String name, String sex, int age, String school){
		this(name, sex, age);
		this.school = school;
	}
	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}
}

public class ExtDemo01 {
	public static void main(String[] args) {
		Student stu = new Student("Zhangsan", "male", 30);
		System.out.println("Name:" + stu.getName() + " Age:" + stu.getAge()
				+ " Sex:" + stu.getSex());
	}

}
