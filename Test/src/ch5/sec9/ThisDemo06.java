package ch5.sec9;
/** 
 * @author Kelvin 
 * @version 2020年8月22日 下午7:25:26 
 * @class instruction 
 */

class Persons{
	public String getInfo(){
		System.out.println("Call the method to print " + this);
		return null;
	}
}
public class ThisDemo06 {
	
public static void main(String[] args) {
	Persons per1 = new Persons();
	Persons per2 = new Persons();
	System.out.println("Print the Object directly:" + per1);
	per1.getInfo();
	
	System.out.println("Print the Object directly:" + per2);
	per2.getInfo();
	
}

}
