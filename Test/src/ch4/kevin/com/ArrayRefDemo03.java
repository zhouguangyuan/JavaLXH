package ch4.kevin.com;
/** 
 * @author 作者 Kevin Zhou 
 * @version 创建时间：2019年7月19日 下午8:59:17 
 * 类说明 
 */
public class ArrayRefDemo03 {

	public static void main(String[] args) {
        int [] score = { 67, 89, 69, 90, 100, 75, 90 } ;
        int [] age = { 31, 30, 18, 17, 8, 9, 1, 39 } ;
        
        sortd( score) ;
        print(score) ;
        
	}
	
	/*
	 * 数组排序
	 */
	public static void sortd ( int[] x ) {
		for ( int i = 1 ; i < x.length ; i++ ) {
			for ( int j = 0; j < x.length-i; j++ ){
				if( x[j+1] < x[j] ) {
					int temp = x[j] ;
					x[j] = x[j+1] ;
					x[j+1] = temp ;
				}
			}
		}
	}
	
	/*
	 * 循环输出数组
	 */
	public static void print( int[] temp) {
		for ( int i = 0; i < temp.length; i++ )
			{
			System.out.println("temp[" + i + "] = " + temp[i]);
		}
	}
}
