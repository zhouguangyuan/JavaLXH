package ch3.sec4;

/**
 * @author 作者 Kevin Zhou
 * @version 创建时间：2020年4月23日 上午11:28:37 类说明
 */
public class OperatorDemo08 {
	public static void main(String[] args) {
		// 定就整型变量
		int score = 50;

		if (score < 0 || score > 100) {
			System.out.println("输入的成绩有错误！");
		}

		if (score < 60 && score > 49) {
			System.out.println("成绩不及格，准备补考吧！");
		}
	}
}
