package ch4.kevin.com;
/** 
 * @author 作者 Kevin Zhou 
 * @version 创建时间：2019年7月19日 上午11:31:28 
 * 类说明 ：
 * 
 * 方法可以接收一个数组，也可以返回一个数组，
 * 只需要在返回值类型声明处
 * 明确地写出返回的数组类型即可。
 * 
 
 */
public class ArrayRefDemo02 {

	public static void main(String[] args) {
		 int [] temp = fun() ;
         print(temp) ;
	}
	
	/*
	 * 循环输出 数组:for循环实现
	 */
	public static void print( int []x ) {
		for( int i = 0; i < x.length; i++ ) {
			System.out.println("x[" + i + "] = " + x[i]);
		}
	}
	/*
	 * 方法返回一个数组
	 * */
	   public static int [] fun() {
		   int [] ss = { 1, 3, 5, 7, 9 } ;
	      	 return ss; 
	       }

}
