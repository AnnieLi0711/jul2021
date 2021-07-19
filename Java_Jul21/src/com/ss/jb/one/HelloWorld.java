package com.ss.jb.one;

/**
 * This is a class to demo Hello World. Jul 2021.
 * 
 * @author ppradhan
 *
 */
public class HelloWorld {

	// default constructor
	public HelloWorld() {
		System.out.println("Def Constructor is called");
	}

	// password constructor
	public HelloWorld(String password) {
		System.out.println("password Constructor is called");
	}

	// username/password constructor
	public HelloWorld(String username, String password) {
		System.out.println("username/password Constructor is called");
	}

	public void runPublic() {
		System.out.println("Running public method - parent");
	}

	protected void runProtected() {
		System.out.println("Running protected method");
	}

	private void runPrivate() {
		System.out.println("Running private method");
	}

	void runDef() {
		System.out.println("Running default method");
	}

	public static void main(String[] args) {
		
	}

}
