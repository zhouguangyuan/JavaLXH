package ch4.kevin.com;
/**
 *数组的排序操作
 *
 */
public class ArrayDemo06 {

	public static void main(String[] args) {
		// 冒泡排序法
		int score [] = { 67, 89, 87, 69, 90, 100, 75, 90 }; //使用静态初始化声明数组

		for ( int i = 1; i < score.length; i++) {
			for ( int j = 0; j < score.length-1-i; j++ ) {  //
				if( score[j+1] < score[j] ) {   //交换位置
					int temp = score[j];
					score[j] = score[j+1];
					score[j+1] = temp;
				}
			}
		}

		System.out.print("最终的排序结果为：\t");
		for( int i = 0; i < score.length; i++)   //循环输出
		{
			System.out.print(score[i]+"\t");
		}


	}

}
