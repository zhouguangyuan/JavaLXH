package ch5.sec7;

/**
 * @author Kelvin
 * @version 2020年8月17日 下午3:48:37
 * @class instruction
 */
public class SimpeDemo05 {

	public static void main(String[] args) {
		String str1 = "Lixinghua";
		String str2 = new String("Lixinghua");
		String str3 = str2;
		String name = new String("Lixinghua02");
		System.out.println( "str1 equals str2 --> " + str1.equals( str2 ) );
		System.out.println( "str1 equals str3 --> " + str1.equals( str3 ) );
		System.out.println( "str2 equals str3 --> " + str2.equals( str3 ) );
		
	}

}
