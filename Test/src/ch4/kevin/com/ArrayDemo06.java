package ch4.kevin.com;
/**
 *������������
 *
 */
public class ArrayDemo06 {

	public static void main(String[] args) {
		// ð������
		int score [] = { 67, 89, 87, 69, 90, 100, 75, 90 }; //ʹ�þ�̬��ʼ����������

		for ( int i = 1; i < score.length; i++) {
			for ( int j = 0; j < score.length-1-i; j++ ) {  //
				if( score[j+1] < score[j] ) {   //����λ��
					int temp = score[j];
					score[j] = score[j+1];
					score[j+1] = temp;
				}
			}
		}

		System.out.print("���յ�������Ϊ��\t");
		for( int i = 0; i < score.length; i++)   //ѭ�����
		{
			System.out.print(score[i]+"\t");
		}


	}

}
