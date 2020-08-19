package ch5.sec7;
/** 
 * @author Kelvin 
 * @version 2020年8月18日 下午3:51:53 
 * @class instruction 
 */
public class StringAPIDemo03 {
	
	public static void main(String[] args) {
		String str1 = "Hello";
		byte b[] = str1.getBytes();
		
		System.out.println(new String(b));
		System.out.println(new String(b, 1, 3));

	}

}
