
public class printNumber {

	public static void main(String[] args) {
		System.out.println(printNumber());

	}	
	
	// Qual sera a saida?
	private static int printNumber() {
		try {

			return 3;
		}

		catch (Exception e) {

			return 4;
		}

		finally {
			
			return 5;
		}
	}

}
