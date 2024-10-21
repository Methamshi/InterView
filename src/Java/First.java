package Java;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String message = "Hi planit. this is a confirmation message for your recent purchese. your oorder has been placed ith order id #638345.Thank you for your purchase";
		String[] b = message.split("\\.");

		for (String t : b) {
			System.out.println(t);
		}
String a=message.replace(" ", "-");
System.out.println(a);
String c=message.replaceAll("[^0-9]","");
System.out.println(c);
	}

}
