package ch6.sec9;

/**
 * @author Kelvin
 * @version 2020年9月23日 上午11:36:38
 * @class instruction
 */

/*interface Fruit {
	public void eat();
}

class Apple implements Fruit {
	public void eat() {
		System.out.println("***Eat apple!");
	}
}

class Orange implements Fruit {
	public void eat() {
		System.out.println("***Eat orange!");

	}
}*/

public class InterfaceCaceDemo03 {
	public static void main(String[] args) {
        Fruit f = new Apple();
        f.eat();
	}
}
