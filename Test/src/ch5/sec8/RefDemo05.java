package ch5.sec8;

/**
 * @author Kelvin
 * @version 2020年8月19日 下午5:00:55
 * @class instruction 接收本类的引用
 */

class Person {
	private String name;
	private int age;
	private Book book;
	Person child;

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

	public Book getBook() {
		return book;
	}

	public Person getChild() {
		return child;
	}

	public void setChild(Person child) {
		this.child = child;
	}

	public void setBook(Book book) {
		this.book = book;
	}

}

class Book {
	private String title;
	private float price;
	private Person person;

	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(String title, Float price) {
		this.title = title;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
}

public class RefDemo05 {

	public static void main(String[] args) {
		Person per = new Person("张三", 30);
		Book bk = new Book("JAVA SE核心技术", 90.5f);
		per.setBook(bk);
		bk.setPerson(per);

	}

}
