package ch4.kevin.com;
/**
 *数组的排序操作
 * 
 */
public class ArrayDemo06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int score [] = { 91, 92, 93, 94, 95, 96 }; //使用静态初始化声明数组
		
		int max = 0;
		int min = 0;
		
		max = min = score[0];
		
		for( int x = 0; x < score.length; x++)   //循环输出
		{
			if(score[x] > max){
				max = score[x];
			}
			if(score[x] < min){
				min = score[x];
			}
		}
		System.out.println("最高成缚" + max);  //输出最大值
		System.out.println("最低成缚" + min);	//输出最小值

	}

}
