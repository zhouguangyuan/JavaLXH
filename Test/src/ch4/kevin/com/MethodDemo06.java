package ch4.kevin.com;
/** 
 * @author 作者 Kevin Zhou 
 * @version 创建时间：2019年7月18日 下午2:55:40 
 * 类说明 ：方法的递归调用
 * 递归调用是一种特殊的调用形式，是方法自己调用自己。
 * 递归调用必须有一个明确的结束条件，然后不断改变传入的数据，才可以实现递归调用。
 */
public class MethodDemo06 {
		public static void main(String[] args) {
            System.out.println( "计算结果是："+ sum(100) );
		}
		
		public static int sum(int num ) {
			if ( num == 1 ) {
				return 1 ;
			}else { 
			return num + sum( num - 1 ) ;
			}
		}

}
