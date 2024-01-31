package org.comit.comit_java_01_variables;

public class variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		in java we have primitive and reference variables
		
//		Integer data types
		int num1 = 4; // declare and initialise
		System.out.println(num1);
		
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		
		System.out.println(Long.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
		
		System.out.println(Short.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);
		
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		
//		decimal variables
		float num2 = 4.6F;  // 8 digits only
		double num3 = 4.6;  // 15 digits
		System.out.println(num2 + num3);
		
//		Boolean
		boolean bool1 = true;
		boolean bool2 = false;
		System.out.println(bool1);
		System.out.println(bool2);
		
			
//		character
		char chr1 = 'A';
		int num7 = chr1;
		System.out.println(chr1); 
		System.out.println(num7); // 65 ASCII value
		
		System.out.println((int)chr1); // casting 
		
//		Reference types
		
//		Strings
		String str = "Hello";
		String str2 = "Hello";
		System.out.println(str + str2);
		
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		
		if (s1 == s2) {
			System.out.println("equals");
		} else {
			System.out.println("different");
		}
			
		if (str.equals(s2)) {
			System.out.println("equals");
		} else {
			System.out.println("different");
		}
		
		if (str == str2) {
			System.out.println("equals");
		} else {
			System.out.println("different");
		}
		
		
		
	}

}
