package com.sl.Assignments.assistedProjectphase1L2.InnerClass;

public class InnerClass1 {
	
		private String message="Hi Ankit"; 
		class Inner{ 
		 void hello(){System.out.println(message+", Let us start learning Inner Classes...");} 
		} 
		public static void main(String[] args) {
			InnerClass1 obj=new InnerClass1();
			InnerClass1.Inner in=obj.new Inner(); 
		    in.hello(); 
		}
	}
	
	

