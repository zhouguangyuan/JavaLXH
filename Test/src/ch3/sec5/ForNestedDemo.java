package ch3.sec5;

/**
 * @author Kelvin
 * @version 2020年4月27日 下午3:02:34
 * @class instruction 打印九九乘法表
 * 循环的嵌套
 */
public class ForNestedDemo {
	public static void main(String[] args) {
        for( int i = 1; i <= 9; i++ ){
        	for( int j = 1; j <= i; j++ ){
        		System.out.print( j + "x" + i + " = " + (j*i)+" " );
        	}
        	System.out.println();
        }
	}
}
