package ch4.kevin.com;

public class MethodDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    printInfo(); //调用printInfo()方法
	    printInfo();  //调用printInfo()方法
	    printInfo();  //调用printInfo()方法

	}
	
	//在此处，printInfo()方法是由main()方法直接调用，所以一定要加上public static 
	public static void printInfo() {   //此方法没有返回值
		char c[] = {'H', 'e', 'l', 'l', 'o', ',','L', 'X', 'H' };  //定议一个字符数组
		
		for ( int i = 0; i < c.length; i++) {  //循环输出
			System.out.print(c[i]);
		}
		
		System.out.println("");  //换行
	}

}
