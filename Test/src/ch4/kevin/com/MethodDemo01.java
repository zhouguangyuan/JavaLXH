package ch4.kevin.com;

public class MethodDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    printInfo();
	    printInfo();
	    printInfo();

	}
	
	public static void printInfo() {
		char c[] = {'H', 'e', 'l', 'l', 'o', ',','L', 'X', 'H' };
		
		for ( int i = 0; i < c.length; i++) {
			System.out.print(c[i]);
		}
		
		System.out.println("");
	}

}
