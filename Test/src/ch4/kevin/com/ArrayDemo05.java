package ch4.kevin.com;
/*
 * ���鶯̬��ʼ�����������������飬Ȼ����Ϊ�����е�ÿ�����ݸ�ֵ�ķ�ʽ��
 * ���龲̬��ʼ����ֱ��������ʱ�͸����鸳��ֵ���������������ʽ����ʹ�ô����Ÿ���ֵ��ɡ�
 * ����Ҫָ������ĳ��ȣ���ֵ�ĸ��������鳤�ȡ������͸�ֵ����ͬʱ���У���������������ֵ��
 * 
 * ��������е����ֵ����Сֵ
 * */

public class ArrayDemo05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int score [] = { 91, 92, 93, 94, 95, 96 }; //ʹ�þ�̬��ʼ����������
		
		int max = 0;
		int min = 0;
		
		max = min = score[0];
		
		for( int x = 0; x < score.length; x++)   //ѭ�����
		{
			if(score[x] > max){
				max = score[x];
			}
			if(score[x] < min){
				min = score[x];
			}
		}
		System.out.println("��߳ɸ�" + max);  //������ֵ
		System.out.println("��ͳɸ�" + min);	//�����Сֵ

	}

}