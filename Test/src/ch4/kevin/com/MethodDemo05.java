package ch4.kevin.com;
/** 
 * @author ���� Kevin Zhou 
 * @version ����ʱ�䣺2019��7��18�� ����2:55:40 
 * ��˵�� 
 */
public class MethodDemo05 {
		public static void main(String[] args) {
			System.out.println("1���{��fun()����֮ǰ");
			fun(10);
			System.out.println("2���{��fun()����֮��");
			System.out.println();
		}
		
		public static void fun(int x) {
			System.out.println( "3���M��fun()����" );
			if( x==10) {
				return;  //�������������ر����ô�
			}
			System.out.println( "4����������fun()����" );
		}
}