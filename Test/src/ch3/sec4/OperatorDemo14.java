package ch3.sec4;

/**
 * @author 作者 Kevin Zhou
 * @version 创建时间：2020年4月24日 上午9:36:04 
 * 类说明:括号运算符 
 */
public class OperatorDemo14 {
	public static void main(String[] args) {
		int result1 = 3 + 5 + 4 * 6 - 7;
		int result2 = (3 + 5 + 4) * (6 - 7);

		System.out.println(" 3 + 5 + 4 * 6 - 7 =" + result1);
		System.out.println(" 3 + 5 + 4 * 6 - 7 = " + result2);

	}
}
