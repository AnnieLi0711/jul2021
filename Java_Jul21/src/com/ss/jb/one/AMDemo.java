/**
 * 
 */
package com.ss.jb.one;

/**
 * @author ppradhan
 *
 */
public class AMDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HelloWorld hw = new HelloWorld("password");
//		hw.runPrivate();
		StaticDemo sd1 = new StaticDemo();
		sd1.printInstanceCount();
		System.out.println(sd1.globalVar);
		
		StaticDemo sd2 = new StaticDemo();
		sd2.printInstanceCount();
		
		StaticDemo sd3 = new StaticDemo();
		sd3.printInstanceCount();
		
		sd1.printInstanceCount();
		
		for(String a: args) {
			System.out.println(a);
		}
	}

}
