package ch5.sec7;

/**
 * @author Kelvin
 * @version 2020年8月18日 下午3:51:53
 * @class instruction
 */
public class StringAPIDemo11 {

	public static void main(String[] args) {
		String str1 = "**Hello World!";
		String str2 = "Hello World!**";
		
		System.out.println("Whether or not, starts with the **:" + str1.startsWith("**"));
		System.out.println("Whether or not , ends with the **:" + str2.endsWith("**"));
	
	}

}
