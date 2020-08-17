package ch5.sec7;

/**
 * @author Kelvin
 * @version 2020年8月17日 下午3:48:37
 * @class instruction 
 * 如果一个字符串已经被一个名称所引用，则以后再有相同的字符串声明时，就不会再重新开辟空间。
 */
public class SimpeDemo07 {

	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = "Hello";
		System.out.println("str1 == str2 -->" + (str1 == str2));
		System.out.println("str1 == str3 -->" + (str1 == str3));
		System.out.println("str2 == str3 -->" + (str2 == str3));
	}
}
