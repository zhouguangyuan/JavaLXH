package ch4.kevin.com;

public class MethodDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    printInfo(); //����printInfo()����
	    printInfo();  //����printInfo()����
	    printInfo();  //����printInfo()����

	}
	
	//�ڴ˴���printInfo()��������main()����ֱ�ӵ��ã�����һ��Ҫ����public static 
	public static void printInfo() {   //�˷���û�з���ֵ
		char c[] = {'H', 'e', 'l', 'l', 'o', ',','L', 'X', 'H' };  //����һ���ַ�����
		
		for ( int i = 0; i < c.length; i++) {  //ѭ�����
			System.out.print(c[i]);
		}
		
		System.out.println("");  //����
	}

}
