import java.util.Scanner;
public class Allowance {
	public static void main(String[] args){

		    Scanner input = new Scanner(System.in);

		    String username;
		    String password;

		    System.out.println("Log in:");
		    System.out.println("username: ");
		    username = input.next();

		    System.out.println("password: ");
		    password = input.next();

		    //users check = new users(username, password);

		    if(username.equals("Luigi") && password.equals("262412")) 
		        System.out.println("Welcome Luigi");
		    
	 else 
		System.out.println("Wrong username or password");


		}
	


}


		
	


