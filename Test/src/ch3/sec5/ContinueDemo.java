package ch3.sec5;
/** 
 * @author Kelvin 
 * @version 2020年4月27日 下午3:36:46 
 * @class instruction 
 */
public class ContinueDemo {

	public static void main(String[] args) {
		for( int i = 0; i <= 10; i++ ){
			if( i == 3)
				continue;
			System.out.println("i = " + i);
		}
          
	}

}
