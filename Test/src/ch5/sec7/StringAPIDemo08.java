package ch5.sec7;

/**
 * @author Kelvin
 * @version 2020年8月18日 下午3:51:53
 * @class instruction
 */
public class StringAPIDemo08 {

	public static void main(String[] args) {
		String str1 = "Hello World!";
		String s[] = str1.split(" ");

		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i] + "\t");
		}

		for (String x : s) {
			System.out.print(x + "\t");
		}

	}

}
