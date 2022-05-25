public class HelloWorld {

	public static void main(String[] args) {
		String first_name = "Jacob";
		String last_name = "Landry";

		System.out.println(hello(first_name, last_name));
	}

	public static String hello(String first_name, String last_name) {
		return "Hello " + first_name + " " + last_name + ", how are you doing today?";
	}

}