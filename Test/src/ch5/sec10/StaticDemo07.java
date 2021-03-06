package ch5.sec10;

/**
 * @author Kelvin
 * @version 2020年8月22日 下午8:15:27
 * @class instruction
 */
class Demon {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	static int count = 0;

	public Demon() {
		count++;
		this.name = "Demon-" + count;
	}

	public Demon(String name) {
       this.name = name;
	}
}

public class StaticDemo07 {
	public static void main(String[] args) {
		System.out.println(new Demon().getName());
		System.out.println(new Demon("LXH").getName());
		System.out.println(new Demon().getName());
		System.out.println(new Demon("MLDN").getName());
		System.out.println(new Demon().getName());

	}

}
