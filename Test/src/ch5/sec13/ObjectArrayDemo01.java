package ch5.sec13;
/** 
 * @author Kelvin 
 * @version 2020年8月28日 下午4:37:08 
 * @class instruction 
 */
public class ObjectArrayDemo01 {
	public static void main(String[] args) {
		Person per[] = new Person[3];
		
		for(int i=0; i < per.length; i++){
			System.out.println(per[i]);
		}
	}

}
