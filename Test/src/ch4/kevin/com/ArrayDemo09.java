package ch4.kevin.com;
/**
 *��̬��ʼ��һ����ά�����
 * 
 */
public class ArrayDemo09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score [][] = { {23, 20, 45, 41}, 
			                      {12, 78}, 
			                      {45, 68, 89}
			                      };
		
		for ( int i = 0; i < score.length; i++ ) {
			for ( int j = 0; j < score[i].length; j++ ) {
				System.out.print(score[i][j] + "\t");
			}
			System.out.println("");
		}
	}
}
