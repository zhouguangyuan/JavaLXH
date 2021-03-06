package ch5.sec8;

/**
 * @author Kelvin
 * @version 2020年8月19日 下午5:00:55
 * @class instruction 接收本类的引用
 */

public class RefDemo06 {

	public static void main(String[] args) {
		Person per = new Person("张三", 30);
		Person child = new Person("张草", 20);
		Book bk = new Book("JAVA SE核心技术", 90.5f);
		Book b = new Book("一千零一夜", 30.3f);
		
		per.setBook(bk);
		bk.setPerson(per);
		per.setChild(child);
		child.setBook(b);
		b.setPerson(child);
		per.setChild(child);
		
		System.out.println("从人找到书-->姓名："+per.getName()+";年龄："+ per.getAge()+";书名："+per.getBook().getTitle()+";价格："+per.getBook().getPrice());
		System.out.println("书找到人-->书名："+bk.getTitle()+";价格："+bk.getPrice()+";姓名："+bk.getPerson().getName()+"年龄："+bk.getPerson().getAge()+";");
		System.out.println("从人找到孩子再找到书-->姓名："+ per.getChild().getName()+";年龄：" + per.getChild().getAge()+";书名："+per.getChild().getBook().getTitle()+";价格：" + per.getChild().getBook().getPrice());
		
		

	}

}
