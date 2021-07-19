/**
 * 
 */
package com.ss.jb.one;

/**
 * @author ppradhan
 *
 */
public class StaticDemo {
	
	public static int instanceCount = 0; //static var
	public int globalVar = 0; //global var

	public StaticDemo() {
		instanceCount++;
	}
	
	public void printInstanceCount() {
		int localVar = 0;
		System.out.println(instanceCount);
	}
	

}
