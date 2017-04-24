
public class HelloEclipse {
	public static void main(String[] args) {
		String str = System.getProperty("message", "Hello");
		System.out.println(str);
	}
}
