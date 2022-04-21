package com.xworkz.pratheek;

public class innerClass {
		
		class Inner{
			
			void innerMethod() {
				
				System.out.println("Inner Class Method");
			}
		}
	}
	class Inner
	{

		public static void main(String[] args) {
		
		innerClass.Inner outInner=new innerClass().new Inner();
		outInner.innerMethod();
			
		}

	}

