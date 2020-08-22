package ch5.sec10;

/**
 * @author Kelvin
 * @version 2020年8月22日 下午8:15:27
 * @class instruction
 */

public class StaticDemo08 {
	public static void main(String[] args) {
	if(args.length != 3){
		System.out.println("The argument is less than three.");
		System.exit(0);
	}
	
	for( int i = 0; i < args.length; i++){
		System.out.println("args["+i+"]"+args[i]);
	}
	}
}
