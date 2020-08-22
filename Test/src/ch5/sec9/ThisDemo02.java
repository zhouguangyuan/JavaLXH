package ch5.sec9;

/**
 * @author Kelvin
 * @version 2020年8月21日 下午8:54:29
 * @class instruction
 */
public class ThisDemo02 {
	public static void main(String[] args) {
        Person per = new Person("Kevin", 30);
        System.out.println("The Name is " + per.getName()+"; \nThe Age is " + per.getAge()+ ";");
	}

}
