package ch5.sec7;
/** 
 * @author Kelvin 
 * @version 2020年8月18日 下午3:51:53 
 * @class instruction 
 */
public class StringAPIDemo01 {
	
	public static void main(String[] args) {
		String str1 = "Hello";
		char c[] = str1.toCharArray();
		
		for(int i = 0; i < c.length; i++)
		{
			System.out.print("c["+i+"] = " + c[i]+"\t");
		}
		
		System.out.println();
		String str2 = new String(c);
		String str3 = new String(c, 0, 3);
		
		System.out.println(str2);
		System.out.println(str3);
	}

}
