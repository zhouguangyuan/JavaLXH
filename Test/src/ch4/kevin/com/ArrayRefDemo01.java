package ch4.kevin.com;
/** 
 * @author 作者 Kevin Zhou 
 * @version 创建时间：2019年7月18日 下午5:49:23 
 * 类说明 :数组的引用传递
 */
public class ArrayRefDemo01 {

	public static void main(String[] args) {
         int [] temp = { 1, 3, 5 } ;
         
         fun(temp) ;
         for ( int i = 0; i < temp.length; i++ ) {   //循环输出数组，查看数组内容
        	 System.out.println(temp[i]);
         }
         
      
	 }
	   public static void fun( int x[]) {
      	 x[0] = 6 ;    //修改数组第一个元素的内容
      	 
       }

}

