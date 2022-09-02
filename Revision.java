package javaproject;

public class Revision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		int y = 5;
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y);
		System.out.println(x%y);
		
		//relational comparision
		System.out.println("relational comparision");
		
		//<, >, <=, >=, ==, !=
		
		System.out.println(7<9);
		System.out.println(7==9);
		System.out.println(5>0);
		System.out.println(4 == 4);
		
		
		 System.out.println("logical operator");
		 //&&
		 System.out.println(3>2 && 7==7);
		 System.out.println(6==6 && 5>8);
		 
		 //OR
		 System.out.println(3>2 || 7==7);
		 System.out.println(6==6 ||5 > 8);
		 
		 //NOT
		 System.out.println(!(7==7));
		 System.out.println(!(6==5));
		 
		System.out.println("conditional statements");
		int numberofTickets = 5;
		if(numberofTickets>0 && numberofTickets<=5) {
			System.out.println("5% discount");
			
		}
		 if(numberofTickets >5 && numberofTickets<=10) {
	    System.out.println("10% discount");
	    
		 }
          if(numberofTickets>10) {
	     System.out.println("20% discount");
	     
}

	int marks = 65;
	if(marks>90) {
		System.out.println("A grade");
	}
	if(marks>60) {
		System.out.println("B grade");
	}	
	if(marks>45) {
		System.out.println("C grade");
	}
	if(marks>0) {
		System.out.println("failed");
	}
	
	if(marks>90) {
		System.out.println("A grade");
	}
	else if(marks>60) {
		System.out.println("B grade");
	}	
	else if(marks>45) {
		System.out.println("C grade");
	}
	else {
		System.out.println("failed");
	}
	
	int x1 = 12;
	int y1 = 13; 
    int z1 = 14;
     if(x1>y1) {}
     if(x1>z1) {
    	 System.out.println("x1 is graeter");
     }
     else 
    	 {System.out.println("z1 is greater");
     
    	 }
	
	if(y1>z1) {
			System.out.println("y1 is greater");
		}
	
	else {
		System.out.println("z1 is greater");
	}
	
	// switch case
	System.out.println("switch case");
	
	
	String country = "Nepal";
			switch(country) {
			case "england":
				System.out.println("Asia");
				break;
			case "america":
				System.out.println("north america");
				break;
			case "Australia":
				System.out.println("Australia");
				break;
			case "Nepal":
				System.out.println("europe");break;
			default:
				System.out.println("not correct");
	
			}
	
	
	System.out.println("for loop");
	
	//for(initialization; conditionCheck; increment/decrement)
	//print from 10 to 20
	for(int m = 10; m<=20; m++) {
		System.out.println(m);
	}
	// reverse
	for(int m1=20; m1>10;m1--) {
		System.out.println(m1);
	}
	
	//while loop
	int m2= 4;
	while(m2<=9) {
		System.out.println(m2);
		m2++;
	}
	
	//
	System.out.println("reverse");
	int m3=9;
	while(m3>4) {
		System.out.println(m3);
		m3--;
	}
	
	System.out.println("do while");
	int m4 = 1;
	do {
		System.out.println("good");
	}while(m4==22);
	
	

	
	

	String a29 = "kathmandu";
	System.out.println(a29);
	int a30 = a29.length();
	System.out.println(a30);
	
	for (int i = 0;i<a29.length();i++) {
	System.out.println(a29.charAt(i));
	}
	
	

	
	String a31 = "kathmand";
	for(int h1 = 0; h1<a31.length();h1++)
		
	{
	
	System.out.println(h1);
	
	}
	

	
	
	
	}

	}
