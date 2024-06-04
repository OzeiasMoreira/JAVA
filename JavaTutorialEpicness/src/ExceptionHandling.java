
public class ExceptionHandling {

	public static void main(String[] args) {
		try {
			getInt();
			return;
		}
		catch (NumberFormatException | NullPointerException e){
			System.out.println
			("Hey dude,you can't make an int out out of that.Stop trying to make it happen");
			
		}
		
		finally {
			System.out.println("In the finally block");
		}
		
		System.out.println("End here");

	}
	
	private static void getInt() {
		int myInt = Integer.parseInt("1");
		System.out.println("After parsing ozeias");
	}

}
