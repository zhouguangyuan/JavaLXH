package ch3.sec5;

/**
 * @author Kelvin
 * @version 2020年4月27日 上午11:33:58
 * @class instruction 比较两个数大小，求出最小值
 */
public class MaxDemo {
	public static void main(String[] args) {
		int max = 0;
		int x = 10, y = 3;
		
		//三目运算符
		max = x > y ? x : y;
		System.out.println("Max is " + max);
	}
}
