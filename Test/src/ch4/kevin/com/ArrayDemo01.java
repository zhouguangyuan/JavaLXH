package ch4.kevin.com;

public class ArrayDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int score [] = null;
		
		score = new int[3];
		
		System.out.println("score[0] = "+ score[0]);
		System.out.println("score[1] = "+ score[1]);
		System.out.println("score[2] = "+ score[2]);
		
		for( int x = 0; x <= 2; x++)
		{
			System.out.println("score[" + x + "] = " + score[x]);
		}

	}

}
