package ch5.sec7;

/**
 * @author Kelvin
 * @version 2020年8月18日 下午3:51:53
 * @class instruction
 */
public class StringAPIDemo10 {

	public static void main(String[] args) {
		String str1 = "Hello World!";
		System.out.println(str1);
        String str2 = str1.replace("l", "x");
               
        System.out.println(str1);
        System.out.println(str2);
	}

}
