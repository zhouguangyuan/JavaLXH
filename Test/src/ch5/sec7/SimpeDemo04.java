package ch5.sec7;

/**
 * @author Kelvin
 * @version 2020年8月17日 下午3:48:37
 * @class instruction
 */
public class SimpeDemo04 {

	public static void main(String[] args) {
		String str1 = "Lixinghua";
		String str2 = new String("Lixinghua");
		String str3 = str2;
		System.out.println("str1 == str2 --> " + (str1 == str2));
		System.out.println("str1 == str3 --> " + (str1 == str3));
		System.out.println("str2 == str3 --> " + (str2 == str3));

	}

}
