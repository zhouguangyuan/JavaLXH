package ch4.kevin.com;
/** 
 * @author 作者 Kevin Zhou 
 * @version 创建时间：2019年7月18日 下午2:55:40 
 * 类说明 
 */
public class MethodDemo05 {
		public static void main(String[] args) {
			System.out.println("1、調用fun()方法之前");
			fun(10);
			System.out.println("2、調用fun()方法之后");
			System.out.println();
		}
		
		public static void fun(int x) {
			System.out.println( "3、進入fun()方法" );
			if( x==10) {
				return;  //结束方法，返回被调用处
			}
			System.out.println( "4、正常结束fun()方法" );
		}
}
