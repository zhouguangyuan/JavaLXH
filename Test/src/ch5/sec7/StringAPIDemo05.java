package ch5.sec7;
/** 
 * @author Kelvin 
 * @version 2020年8月18日 下午3:51:53 
 * @class instruction 
 */
public class StringAPIDemo05 {
	
	public static void main(String[] args) {
		String str1 = "abcdefgcgh";
		
		System.out.println(str1.indexOf("c"));
		System.out.println(str1.indexOf("c",3));
		System.out.println(str1.indexOf("x"));

	}

}
