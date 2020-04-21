package ch3.se3;
/** 
 * @author 作者 Kevin Zhou 
 * @version 创建时间：2020年4月21日 下午2:24:20 
 * 类说明 
 * 1)String可以直接通过赋值的方式进行声明。
 * 2)字符串使用双引号引起来。
 * 3)两个字符串之间可以使用"+"进行连接。
 * 4)任何数据类型碰到String类型的变量或常量之后都向String类型转换。
 */
public class DataDemo09 {
	public static void main(String arg[]){
		String str = "lixinhua ";
		str = str + 30;
		System.out.println("Str = " + str);
	}

}
