package ch4.kevin.com;

/**
 * @author Kelvin
 * @version 2020年5月30日 下午4:42:38
 * @class instruction
 */
public class NewDemo02 {
	public static void main(String[] args) {
		System.out.print("\n不传弟参数( fun() ):");
		fun();
		System.out.print("\n传递1个参数");
		fun(1);
		System.out.print("\n传递5个参数");
		fun(1, 2, 3, 4, 5);

	}

	public static void fun(int... args) {
		for ( int x : args) {
			System.out.print( x + " , ");
		}
	}
}
