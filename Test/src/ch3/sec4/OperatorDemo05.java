package ch3.sec4;
/** 
 * @author 作者 Kevin Zhou 
 * @version 创建时间：2020年4月23日 上午10:44:31 
 * 类说明 ：关系运算符
 */
public class OperatorDemo05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if( 5 > 2){
			System.out.println("条件成立：5 > 2 ");
		}
		
		//如果if语句之中只有一条语句，则花括号可以省略。
		//为了便于调试程序，提高程序的可读性，建议还是
		//加上花括号。
		if(true)
			System.out.println("直接写的true");
		
		if( ( 3 + 6 ) == ( 3 -6 ) ) //布尔表达式不成立
		{
           //此句永远不可能被执行			
			System.out.println("这是不可能成立的！");
		}

	}

}