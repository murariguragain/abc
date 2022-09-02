package javaproject;

public class RevisionD {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Methods
		
		Substraction(4,5);
		Addition1(3,3);
		Add();
		int v= Multiply(50,40);
		System.out.println(v);
		String a = "ilam";
		int b = a.length();
			System.out.println(b);
		
		String c = a.toUpperCase();
		System.out.println(c);
		System.out.println("welcome to "+ a);
		char d = c.charAt(0)
	;
		System.out.println(d);
		
		
		for(int i=a.length()-1; i >=0;i--) {
		System.out.println(a.charAt(i));
		
		}
		String city = "toronto";
		switch(city) {
		case "toronto":
		System.out.println("canada");
		break;
		case "taxas":
		System.out.println("america");
		break;
		default:
		System.out.println("no");
		}
		
		int a1 = 10;
		int b1 = 5;
		System.out.println(a1+b1);
		System.out.println(a1-b1);
		System.out.println(a1*b1);
		System.out.println(a1/b1);
		System.out.println(a1%b1);
		Addition(12,10);
		Sub();
		Mul(12,12);
		int a5 = calculator(20,20);
		System.out.println(a5);
		System.out.println(a5+a5);
		System.out.println(a5%0.10);
		
		
		
		
		
		
		//DRY
	}
		public static void Addition(int a2, int b2) {
			System.out.println(a2+b2);
		
		
		
		//without parameter and without return type
}		
		
		public static void Sub() {
			System.out.println(2+4);
		}

		
		// with parameter and without return type
		public static void Mul(int a3, int b3) {
			System.out.println(a3+b3);
		}
	
		//with parameter and with return type
		public static int calculator(int a4, int b4){
			return a4+b4;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		public static void Addition1(int x, int y){
			
		
		System.out.println(x+y);
	
		
		
		
		}
		
		

		
		
		public static void  Substraction(int a, int b) {
			System.out.println(a*b);
		}
		
		
		
		
		public static void Add() {
			System.out.println(3+5);
		}
		
		public static int Multiply(int s, int t) {
			return s*t;
		}
		
		}
		
		

	
		
		
