package com.trabelsibilel.week3;

public class CodingAssign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// Step 1
	//	a , b
//		System.out.println("STEP 1");
//		int ages [] = {3 , 9 , 23 , 64 , 2 , 8 , 28 , 93 , 10};
//		int i=0;
//		int substract = ages [ages.length-1] - ages [i];
//		System.out.println(substract);
//		
//		//c
//		
//		int sum = 0;
//		
//	for ( int age : ages) {
//		sum += age;
//			}
//	
//	double average = sum / ages.length ;
//		System.out.println(sum);
//		System.out.println(average);

//2				
		System.out.println("STEP 2");
	     
		String names [] = { "Sam" , "Tommy" , "Tim" , "Sally" , "Buck" , "Bob"};
		
		int sum = 0;
		for (int i = 0 ; i < names.length ; i++) {
			 sum += names[i].length();
		}
		
		double average = sum / names.length ;
		System.out.println(sum);
		System.out.println(" average number of letters= " + average);
		 
		String namesTogether= " ";
		 for ( int i = 0; i<names.length ; i++) {
		 namesTogether += names [i] + " " ;
		 }
		 System.out.println( " Names together with space between=  " + namesTogether);
		
// step 2.  3 
		 System.out.println(" Last element of the array is " + names [names.length-1] );
// step 2 . 4
		 System.out.println(" First element of the array is " + names[0]);
// step 2 . 5
		 
		 int[] nameLengths = new int[names.length];
			for (int i = 0; i < names.length; i++) {
				nameLengths[i] = names[i].length(); 
				}
// step 2 . 6
		 sum = 0 ;
		 for ( int i =0 ; i < nameLengths.length ; i++ ) {
			 sum += nameLengths[i];
			 }
		 System.out.println(" Sum of all elementsin array = " + sum);
		 

// step 2 . 7
	}
		 public static String multyString ( String str , int num) {
			 String result = "";
			 	for ( int i =0; i < num ; i++  ) {
			 		result += str;
			 	}
			 	return result;
			 }
		
// step 2. 8
		 public static String createFullName ( String firstName , String lastName) {
			 String fullName = firstName + "" +lastName;
			 return fullName;
			 }
		 
// step 2. 9
		 public static boolean greater ( int [] numbers) {
			 int sum = 0;
			 for (int number : numbers) {
				 sum += number;
				 }
			 if ( sum >= 100) {
				return true; 
				}
			 else {
				 return false;
				  }
		 }
// step 2. 10		 
			
		 public static double arrayAverage ( double [] number) {
			 double sum = 0;
			 for (double numbers : number) {
				 sum += numbers;
			 }
			 double average = sum / number.length ;
			 return average;
			 }
// step 2.11
		 
		 public static boolean compareArray ( double [] array1 , double [] array2) {
		 
			 double sum1 = 0;
			 for (double number1 : array1) {
				 sum1 += number1;
				 }
			 	double average1 = sum1 / array1.length;
			 
			 double sum2 = 0;
			 for (double number2 : array2) {
					 sum2 += number2;
					 }
			double average2 = sum2 / array2.length;	 	
			
			if ( average1> average2) {
				return true; 
				}
			 else {
				 return false;
				  }
			}
	
// step 2. 12
		 
		 public static boolean willBuyDrink (boolean isHotOutside , double moneyInPocket) {
			 if ( isHotOutside = true && moneyInPocket > 10.50) {
				 return true ;
			 } else {
				 return false;
			 }
		}
		
// step 2. 13
		 
		// i would use this method to scan forecast from a server, and determine if im going to kite surf or not 
		 public static boolean goKitting (boolean isWindy , double windSpeed) {
			 if ( isWindy = true && windSpeed > 15) {
				 return true ;
			 } else {
				 return false;
			 }
		 }  

}
