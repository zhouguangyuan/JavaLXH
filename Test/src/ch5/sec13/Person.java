package ch5.sec13;

/**
 * @author Kelvin
 * @version 2020年8月28日 下午4:35:09
 * @class instruction
 */
public class Person {
	String name = null;

	public Person() {

	}

	public Person(String name) {
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setName(String name){
		this.name =name;
	}
}
