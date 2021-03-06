package ch3.sec5;

/**
 * @author Kelvin
 * @version 2020年4月27日 下午3:27:16
 * @class instruction
 * 一、在Java语言中,可以使用如break、continue
 * 等中断语句。站在结构化程序设计的角度上，
 * 并不鼓励用户使用中断语句，因为这些中断语
 * 句会增加调试及阅读的困难。因此建议尽量不
 * 要使用中断语句。
 * 二、break语句可以强迫程序中断循环，当程序
 * 执行到break语句时，即会离开循环，继续
 * 执行循环外的下一下语句。
 * 三、如果break语句出现在嵌套循环中的内层
 * 循环，则break语句只会离开当前层循环。
 */
public class BreakDemo {

	public static void main(String[] args) {
		int i = 0;

		for (; i <= 10; i++) {
			if (i == 3) {
				break;
			}
			System.out.println( "i = " + i);
		}
	}

}
