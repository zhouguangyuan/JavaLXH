package ch3.sec4;
/** 
 * @author 作者 Kevin Zhou 
 * @version 创建时间：2020年4月21日 下午5:15:25 
 * 类说明 
 */
public class SimpleExpressDemo02 {
	public static void main(String args[]){
		int a = 10, b = 6 ;
		System.out.println("改变之前的数 a = " + a + ", b = " + b);
		a -= b++;
		System.out.println("改变之后的数 a = " + a + ", b = " + b);
	    
	}

}
