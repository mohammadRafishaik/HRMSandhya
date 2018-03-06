package com.str;

public class Stringallmethods {
	
	public static void charat()
	////////CharAt method//////////////
	{
		String str="i am one of the Testingmasters person";
		
		char ch1=str.charAt(2);
		System.out.println(" charecter aty 0 index "+ch1);
	}
	///Equals method
	public static void equals(){
		
		String str1="i am not a right person";
		String str2="i am not a worng person";
			
			System.out.println(" print status based on condition1 "+str1.equals(str2));
			
		
	}
	////Eqalsignorecase method
	public static void equalsignorecase(){
		String str1="i am not a right person";
		String str2="i am not a worng person";
	
		System.out.println(" status based on condition2 "+str1.equalsIgnoreCase(str2));
		
		
	}
	///////compareto method
	public static  void intcompareto(){
		String str1="i am not a right person";
		String str2="i am not a worng person";
		System.out.println(" status based on condition3 "+str1.compareTo(str2));
		
	}
	
	public static void comparetoignorecase(){
		String str1="TESTING";
		String str2="sddfgrbfdgdf";
		System.out.println(" status based on condition4 "+str1.compareToIgnoreCase(str2));
	
		
		
	}
	
	public static void startwith(){
		char[] chr={'a','b','c'};
		char ch='b';
		String str3=" in the world";
		String str4=" in the city";
		System.out.println(str3.startsWith(" in"));
		////endwith
		System.out.println(str3.endsWith("city"));
		// hashcode
		System.out.println(str3.hashCode());
		int length=str3.length();
				
		
		///////////////// Ascii value of A B (65,66,..) and a b(97,98)
		System.out.println(" length of str3 "+length);
		int ascii=(int) ch;
		for(int i=0;i<=length-1;i++){
			//int ascii1=(int) i;
			int ch1=(int) i;
			System.out.println(" value of as "+chr);
		//	System.out.println(" value of char "+ch);
		}
		System.out.println( "askii value of a "+ascii);
	}
public static void main(String[] args){
	
//	Stringallmethods.charat();
	//Stringallmethods.equals();
	//Stringallmethods.equalsignorecase();
	//Stringallmethods.intcompareto();
	//Stringallmethods.comparetoignorecase();
	Stringallmethods.startwith();
	System.out.println("charat method as successfully compleated");
	
}
}
