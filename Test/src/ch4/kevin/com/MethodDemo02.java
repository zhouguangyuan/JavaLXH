package ch4.kevin.com;

public class MethodDemo02 {

	public static void main(String[] args) {
		int one = addOne(10, 20);
		float two = addTwo(10.3f, 13.3f); 
		System.out.println("addOne�ļ�������" + one);
		System.out.println("addTwo�ļ�������" + two);
	}
	
	/*
	 * ���巽����������������ļӷ���������������һ��int������
	 * */
	public static int addOne( int x, int y) {
		/*
		 * �ڷ����У����Զ�����������Ϊ�ֲ�������ֻ�ڴ˷�����������
		 * */
		int temp = 0 ;   //tempΪ�ֲ�������ֻ�ڴ˷�����������
		temp = x + y ;  //ִ�мӷ�����
		return temp;	//���ؼ�����
	}
	
	/*
	 * ���巽������������������ĵļӷ���������������һ��float������
	 * */
	public static float addTwo( float x, float y) {
		float temp = 0 ;   //tempΪ�ֲ�������ֻ�ڴ˷�����������
		temp = x + y ;    //ִ�мӷ�����
		return temp;      //���ؼ�����
	}

}