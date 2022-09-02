package javaproject;

public class StringRevision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String country ="nepal";
		System.out.println(country);
		String a = "10";
		String b = "5";
		System.out.println(a+b);
		 //length
		String country2 ="Nepal";
		int a1 = country.length();
		System.out.println(a1);
		//toUppercase
		String a2 = country.toUpperCase();
		System.out.println(a2);
		 //toLowercase
		String a3 = country.toLowerCase();
		System.out.println(a3);
		//concat()
		String a4 = "pumpkin";
		String a5 = "i don't like ";
		System.out.println(a5.concat(a4));
		
		String a6= "i hate banana, ";
		String a7 = "so i never buy it.";
		System.out.println(a6.concat(a7));
		
		// method chaining
		String fruit = "apple";
		int a8 =(fruit.toLowerCase().toUpperCase().length());
		System.out.println(a8);
		
		//equal
		String a9 = "ram";
		String a10 = "ram";
		boolean result = a9.equals(a10);
		System.out.println(result);
		
		
		//contains
		String a11 = " I am from Nepal";
		boolean a12 = a11.contains("am");
		
		String a13 = "Rams singh is a teacher";
		boolean a14 = a13.contains("am");
		System.out.println(a14);
		
		//substring
		String a15 = "pokhara";
		String a16 = a15.substring(2,4);
		System.out.println(a16);
		
		String city = "kathmandu";
		String a17 = city.substring(2,5);
		System.out.println(a17);
		
		//join
		String a18 = "he is a stupid boy,";
		String a19 = " he got slap.";
		String a20 = String.join("so", a18,a19);
		System.out.println(a20);
		
		//replace
		String a21 = "i hava a pet";
		String a22 = a21.replace("hava", "had");
		System.out.println(a22);
		
	//charAt()

		String a23 = "kathmandu";
		char a24 = a23.charAt(6);
		System.out.println(a24);
		
		//indexOf()
		int a25 =a23.indexOf("t");
		System.out.println(a25);
		//trim()
		String a26 = " Ilam ";
		String a27 =a26.trim();
		System.out.println(a27);
	
		//split
		String a28 = "i am new in qa";
		String [] a29 = a28.split(" ");
		System.out.println(a29[0]);
		System.out.println(a29[1]);
		System.out.println(a29[2]);
		System.out.println(a29[3]);
		System.out.println(a29[4]);
		
		// 
		

	}

}
