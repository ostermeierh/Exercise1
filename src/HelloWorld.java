import java.util.Scanner;

public class HelloWorld {
////
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		HelloUser helloUser = new HelloUser();
		
		System.out.println("Hello ASE2017 - How are you now? :)");
		System.out.print("Please enter your name: ");
		String name = new Scanner(System.in).nextLine();
		helloUser.setUserName(name);
		helloUser.printAnswer();
	}

	
}
