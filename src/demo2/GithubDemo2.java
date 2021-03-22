package demo2;

public class GithubDemo2 {

	public static void main(String[] args) {

		System.out.println("My first github commit....");
		
		printString("NoorTeck");
		
	}
	
	public static void printString(String str) {
		System.out.println(str);
	}
	
	//new String VAR
	static String name = "Ahmad";
	
	
	public static void callPrintStringMethod() {
		printString(name);
	}
}
