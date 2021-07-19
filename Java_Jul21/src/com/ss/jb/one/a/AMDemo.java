/**
 * 
 */
package com.ss.jb.one.a;

import com.ss.jb.one.HelloWorld;

/**
 * @author ppradhan
 *
 */
public class AMDemo extends HelloWorld{

	//Overriding
	public void runPublic() {
		System.out.println("Running public method - child");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AMDemo amd = new AMDemo();
		amd.runPublic();

	}

}
