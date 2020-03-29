
public class StringToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "9";
		try {
		System.out.println(Integer.parseInt(s));
		} catch(NumberFormatException e) {
			System.out.println("Number format Exception: "+e);
		}
	}

}
