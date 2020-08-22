package ch5.sec9;

/**
 * @author Kelvin
 * @version 2020年8月21日 下午8:54:29
 * @class instruction
 */

class Person {
	private String name;
	private int age;
	
	public Person(){
		System.out.println("一个新的对象被实例化！");
		
	}

	public Person(String name, int age) {
		this();
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
	
	public String getInfo(){
		return " Name:" + this.name + "\n Age:" + this.age;
	}
	
	public boolean compare(Person per){
		Person p1 = this;
		Person p2 = per;
		
		if(p1==p2){
			return true;
		}
	   if(p1.getName()==p2.getName() && p1.getAge() == p2.getAge()){
		   return true;
			
		}else{
			return false;
		}
		
	}

}

public class ThisDemo01 {
	public static void main(String[] args) {
        Person per = new Person("Kevin", 30);
        System.out.println(per.getInfo());
	}

}
