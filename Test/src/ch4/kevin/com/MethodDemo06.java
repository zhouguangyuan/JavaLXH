package ch4.kevin.com;
/** 
 * @author ���� Kevin Zhou 
 * @version ����ʱ�䣺2019��7��18�� ����2:55:40 
 * ��˵�� �������ĵݹ����
 * �ݹ������һ������ĵ�����ʽ���Ƿ����Լ������Լ���
 * �ݹ���ñ�����һ����ȷ�Ľ���������Ȼ�󲻶ϸı䴫������ݣ��ſ���ʵ�ֵݹ���á�
 */
public class MethodDemo06 {
		public static void main(String[] args) {
            System.out.println( "�������ǣ�"+ sum(100) );
		}
		
		public static int sum(int num ) {
			if ( num == 1 ) {
				return 1 ;
			}else { 
			return num + sum( num - 1 ) ;
			}
		}

}
