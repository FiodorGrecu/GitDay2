package demo;

public class DemoTest {

	public static void main(String[] args) {
		System.out.println("Test");
		add(3,4);
		div(15,3);
	}

	// Addition method
	public static void add(int a, int b) {
		System.out.println(a + b);
	}

	// Subtraction method
	public static void subtraction(int a, int b) {
		System.out.println(a - b);
	}

	// Div method
	public static void div(int a, int b) {
		System.out.println(a / b);
	}

}
