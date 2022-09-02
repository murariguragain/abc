package javaproject;

public class Revisionjava {

	private static char[] z;


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// arithmetic operation
		int a = 10;
		int b = 5;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		// comparasion
		System.out.println(4<6);
		System.out.println(8>7);
		System.out.println(6==6);
		System.out.println(5!=5);
		System.out.println(4>=3);
		
		
		//assignment operator
		int a1=10;
		a1=a1+1;
		a1++;System.out.println(a1);
		
		
		//logical operator
		
		//and operator
		
		System.out.println(5<=5 && 6>9);
		 //or
		
		System.out.println(5<=5 || 6>9);
		
		 //not
		System.out.println(5!=5);
		
		//unary operator
		
		int a2 = 20;
		a2=a2+1;
		a2++;
		System.out.println(a2);
		
		//conditional statements
		
		int a3 = 10;
		if(a3>0) {
			System.out.println("Number is negative");
		}
		
		else {
			System.out.println("number is positive");
		}
		
		
		int a4 = 10; 
		int a5 = 50;
		if(a4>a5) {
			System.out.println("a4 is greater");
		}
		else {
			System.out.println("a5 is greater");
			}
int noOfTickets = 4;
if(noOfTickets >0 && noOfTickets <=5) {
	System.out.println("5% discount");
}
if(noOfTickets >5 && noOfTickets <=10) {		
	System.out.println("10% discount");	
}	
		
	if(noOfTickets>10) {
	System.out.println("30% discount");
		
	}
		
		
		
		int marks = 97;
		if(marks >90) {
			System.out.println("A grade");
		}
		
		else if(marks >65) {
			System.out.println("B grade");
		}
		
		else if(marks>45) {
			System.out.println("C grade");
		}
		else {
			System.out.println("failed");
		}
		
		int a6 = 100;
		int b6 = 50;
		int c6 = 25;
		if(a6>b6) {
	System.out.println("a6 is greater");
	if(a6>c6) {
		System.out.println("a6 is greater");	
		
	}
	
	else {
		System.out.println("c6 is greater");
	}
	
	
	
	int a7 = 20;
	int b7 = 10; 
	int c7 = 50; 
	if(a7>b7 && a7>c7) {
		System.out.println("a7 is greater");
	}
	
	else if(b7>a7 && b7>c7)
	{
		System.out.println("b7 is greater");
	}	
	else {
		System.out.println("c7 is greater");
	}
		}
		
		
		// Switch case
		
		String city = "taxas";
		switch(city) {
		case "newyork":
			System.out.println("Newyork");
			break;
		case "taxas":
			System.out.println("Dallas");
			break;
		case "COlumbus":
			System.out.println("ohio");
			break;
			default:
				System.out.println("incorrectcity");
				
		}
		
		
		//for loop
		
		System.out.println("hello");
		
		for(int i=0;i<5;i++) {
			System.out.println("hello");	
		}
		
		for(int i1 = 10; i1>=0; i1--) {
			System.out.println(i1);
		}
		
		for(int i2 = 20; i2>=1; i2-=2) {
			System.out.println(i2);
		}
		
		for(int i3=5; i3<=50; i3+=5) {
			System.out.println(i3);
		}
		
		//break with for loop
		for(int i4=0; i4<10; i4++ ) {
			if(i4==7) {
				continue;
			}
			System.out.println(i4);
		}
		
		
		// while loop
		int i5 = 0;
		while(i5<5) {
			System.out.println("hello");
			i5++;
		}
		
		int i6 = 5;
		while(i6<=50) {
			System.out.println(i6);
			i6=i6+5;
		}
		
		//table of 5 in reverse
		int i7 =50;
		while(i7>=5) {
			if(i7==35) {
				break;}
			System.out.println(i7);
			i7=i7-5;
		
		
		}
		
		int i8 = 2;
		while(i8<=20) {
			if(i8==4) {
				break;
			}
			System.out.println(i8);
			i8++;
		}
		
		calculator(10,5);	
		calculator(20,10);
		calculator(9,3);
		
		Addition();
		int p = AdditionA(10,11);
		System.out.println(p);
		System.out.println(p+p);
		System.out.println(p*0.10);
		int g = Multiply(2,4);
		System.out.println(g);
		System.out.println(g+g);
		System.out.println(g*g);
		
		
		
		
		
		String city2="dallas";
		System.out.println(city2);
		
	
		
		String c = "Hello ";
		String c1 = "ram ";
		String c2 = "k ";
		int c3 = 6;
		System.out.println(c+c1+c2+c3);
	
		
		int d1 = c.length();
		System.out.println(d1);
		String d2 = c.toLowerCase();
		System.out.println(d2);
		String d3 = c.toUpperCase();
		System.out.println(d3);
		
		//concat
		String boy = " Genius";
		
		String s = "i am";
		String joinedString = s.concat(boy);
		System.out.println(joinedString);
		String a8 = s.concat(joinedString);
		System.out.println(a8);
		
		
		
		String x5 = "Murari ";
		String e1 = "Prasad";
		String joinedString1 = x5.concat(e1);
		System.out.println(joinedString1);
		
		
		// Method Chaining
		
		
		String game = "Football";
		System.out.println(game);
		String q1 = game.toLowerCase();
		System.out.println(q1);
		String q2 = q1.toUpperCase();
		System.out.println(q2);
		int q3 = q2.length();
		System.out.println(q3);
		int q4 = game.toLowerCase().toUpperCase().length();
		System.out.println(q4);
		
		//equals
		String first = "hello";
		String second = "hello";
		boolean result = first.equals(second);
		System.out.println(result);
		//contains
		String thid = "i am ugragain";
		boolean rslt = thid.contains("am");
		System.out.println(rslt);
		
		
		// substring
		String a12 = "kathmandu";
		String rslt1 = a12.substring(3,5);
		System.out.println(rslt1);
		
		//join
		String str = "i am";
		String str2 = "learning";
		String str3 = "java";
		String reslt4 = String.join(" ", str, str2, str3);
		System.out.println(reslt4);
		
		
		//replace
		String thid4 = "i am ugragain am paoudel";
		String reslt5 = thid4.replaceFirst("am" , "he is dahal");
		System.out.println(reslt5);
		
		//charAt()

		String str6 = "pokhara";
		char result3 = str6.charAt(3);
		System.out.println(result3);
		
		
	//trim
		String a17 = "  ram ";
		int a19 = a17.length();
		System.out.println(a19);
		String a18 = a17.trim();
		int a20 = a18.length();
		System.out.println(a20);
		System.out.println(a18);
		
		//do while
		
		int a22 = 5;
		do {
			System.out.println(a22);
			
		}while(a22==3);
		
		
		String a29 = "kathmandu";
		System.out.println(a29);
		int a30 = a29.length();
		System.out.println(a30);
		
		for (int i = 0;i<a29.length();i++) {
		System.out.println(a29.charAt(i));
		}
		
		
		String a44 = "Pokhara";
		
		// reverse 
		String rev = "";
		for(int i61 =0; i61<a44.length(); i61++) {
		
			rev = a44.charAt(i61)+ rev;
			System.out.println(rev);
		}
		
		}
			
		
		
		
		
		//Functions
		
		
		public static void calculator(int x, int y) {
			
			System.out.println(x+y);
			
			System.out.println(x+y);
			System.out.println(x-y);
			System.out.println(x*y);
			System.out.println(x/y);
			System.out.println(x%y);
			
			// without parameter without return
		
			
			
			}
			
			
			public static void Addition() {
				System.out.println(9+9);
			
			;
			}
			
			
			public static void substraction(int s, int t) {
				System.out.println(s+t);
			
			
			
		}

		public static int AdditionA(int s1, int t1) {
		return s1+t1; 
	
		}
		
		public static int Multiply(int e, int f){
			return e*f;
		}
		
		
		{
		
		
		//String method
			
			
		
		}
}
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	


