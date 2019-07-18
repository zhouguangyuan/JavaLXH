package ch4.kevin.com;

/**
 * 
 * @author Kevin Zhou
 *
 */
public class MethodDemo03 {

	public static void main(String[] args) {
		int one = add(10, 20);
		int two = add( 10, 20, 30);
		float three = add(10.3f, 13.3f, 12.5f); 
		System.out.println("addOne�ļ�������" + one);
		System.out.println("addTwo�ļ�������" + two);
	}
	
	/*
	 * ���巽����������������ļӷ���������������һ��int������
	 * */
	public static int add( int x, int y) {
		/*
		 * �ڷ����У����Զ�����������Ϊ�ֲ�������ֻ�ڴ˷�����������
		 * */
		int temp = 0 ;   //tempΪ�ֲ�������ֻ�ڴ˷�����������
		temp = x + y ;  //ִ�мӷ�����
		return temp;	//���ؼ�����
	}
	
	/*
	 * ���巽����������������ļӷ���������������һ��int������
	 * */
	public static int add( int x, int y, int z) {
		/*
		 * �ڷ����У����Զ�����������Ϊ�ֲ�������ֻ�ڴ˷�����������
		 * */
		int temp = 0 ;   //tempΪ�ֲ�������ֻ�ڴ˷�����������
		temp = x + y + z;  //ִ�мӷ�����
		return temp;	//���ؼ�����
	}
	
	/*
	 * ���巽������������������ļӷ���������������һ��float������
	 * */
	public static float add( float x, float y, float z) {
		/*
		 * �ڷ����У����Զ�����������Ϊ�ֲ�������ֻ�ڴ˷�����������
		 * */
		float temp = 0 ;   //tempΪ�ֲ�������ֻ�ڴ˷�����������
		temp = x + y + z;  //ִ�мӷ�����
		return temp;	//���ؼ�����
	}
	


}
