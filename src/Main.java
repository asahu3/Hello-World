
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
			int a;
			
			a = 6;
			
			if (IsEven(a) == true) {
				System.out.println("even");
			}
			else {
				System.out.println("odd");
			}
			
	}

	public static boolean IsEven(int a) {
		if (a%2==0) {
			return true;
		}
		else return false;
	}
}
