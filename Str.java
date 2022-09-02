package javaproject;

public class Str {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Murari";
System.out.println(name);


String city = "kathmandu";
System.out.println(city);


int a = 20; 
int b = 10;
String c = "welcome";
System.out.println(a+b+c);
System.out.println(c  +c);
System.out.println(c+b+a);

//Methods and length
String country = "America";
int m = country.length();
System.out.println(m);
//toUpperCase
 
String citi = "lexington";
String m1= citi.toUpperCase();
System.out.println(m1);
System.out.println("welcome to"+ m1);
 // toLowerCase
String m2 = citi.toLowerCase();
System.out.println(m2);
System.out.println("welcome to"+  m2);


//concat()
String fruit = "banana";
System.out.println(fruit);
String m3 = "i love";
String joinedString = m3.concat(fruit);
System.out.println(joinedString);

// method chaining

String flower = "rose";
System.out.println(flower);
String m4 = flower.toLowerCase();
System.out.println(m4);
int m5 = m4.length();
System.out.println(m5);
 String m6 = flower.toUpperCase();
 System.out.println(m6);
 int m7 = flower.toUpperCase().toLowerCase().length();
 System.out.println(m7);
 













	}
	
}
