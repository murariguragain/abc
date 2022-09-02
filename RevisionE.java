package javaproject;

public class RevisionE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	//AArithmatic operation
		int a = 10;
		int b = 5;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		
		// Relation
		
		System.out.println(2==2);
		System.out.println(5>6);
		System.out.println(6>2);
		System.out.println(4!=4);
		
		
		//and
		System.out.println(4==4 && 5<9);
		System.out.println(4<=5 && 6>=7);
		
		//Or
		System.out.println(4==4 || 5<9);
		System.out.println(4<=5 || 6>=7);
		
		
		//not
		System.out.println(5!=6);
		System.out.println(7!=7);
		
		
		int a1=10;
		int b1 = 5; 
		if(a1>b1) {
			System.out.println("a1 is greter");
		}
		else {
			System.out.println("b1 is greater");
		}
		
		int a2 =100; 
		int b2 = 50; 
		int c2 = 250;
		if (a2>b2 && a2>c2) 
			System.out.println("a2 is greater");
			else if(b2>a2 && b2>c2) 
				System.out.println("b2 is greater");
				else 
					System.out.println("c2 is greater");
			
		
		
		
		int a3= 46;
		if(a3>45) 
		System.out.println("c grade");
		else if(a3 > 60) 
		System.out.println("b grade");
		else 
			System.out.println("no grade");
		
		
		//switch case
		String city = "kathmandu";
		switch(city) {
		case "Pokhara":
			System.out.println("gandaki");
		break;
		
		case "kathmandu":
			System.out.println("bagmati");
			break;
		case "nuwakot":
				System.out.println("rasuwa");
				break;
				default:
					System.out.println("no city");
		}
		
		
		
		// for loop
		int a5= 5;
		for(a5 = 0; a5<5; a5++) {
			System.out.println(a5);
		}
		
		int a6 = 0;
		for( a6=10; a6>=0; a6=a6-3) {
		System.out.println(a6);
		}
		
		// while loop
		int a7 = 0;
		while(a7<10) {
			System.out.println(a7);
			a7++;
		}
		
		int a8 = 100;
		while(a8>10) {
			System.out.println(a8);
			a8=a8-4;
		}
		
		// for loop with break
		int a9 = 90;
		for( a9 = 10; a9< 90; a9=a9+10) {
			if(a9==40){
		continue;}
			System.out.println(a9);
			
		}
		int a11= 5;
		while(a11<20) {
			if(a11==10) {
			continue;}
			System.out.println(a11);
			a11=a11+5;
		}
		
		
		// Methods
		
		
		Add(2,3);
		add1();
		
	}
		
		
		
	public static void Add(int a12, int b12) {
		System.out.println(a12+b12);
	
	}
		public static void add1() {
		System.out.println(12+12);
		
		
		
		
	}
		

	}


