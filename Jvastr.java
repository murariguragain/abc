package javaproject;

public class Jvastr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		String first = "hi";
		String second = "hi";
		boolean result = first.equals(second);
		System.out.println(result);
		
		
		
		// contains
		String m = "A cow is an animal";
		boolean result1 = m.contains("an");
		System.out.println(result1);
		
		String n = "a am a boy";
		boolean result2 = n.contains(m);
		System.out.println(result2);
		
		// substring ()	
		
		String city2 = "ilam";
		String result4 = city2.substring(2);
		System.out.println(result4);
		String result5 = city2.substring(1,3);

		System.out.println(result5);
		
		 // join()
		
		String Murari = "Ram";
		String Hari = "can";
		String Rita = "Learn Java";
		String result6 = String.join(" ", Murari, Hari, Rita);
		System.out.println(result6);
;
		String Sita = "murari";
		String email = String.join("@", Sita,"gmail.com");
		System.out.println(email);
		
		// replace
		
		String st1 = "i can work 24 hrs, c0n wok 5hrs";
		System.out.println(st1.length());
		String st2  = st1.replace("a","0");
		System.out.println(st2);
		
		String st3 = st2.replaceAll("c0n", "am");
		System.out.println(st3);
		
		
		
		//charAt()
		
		String st4 = "taxas";
		char result7 = st4.charAt(2);
		System.out.println(result7);
		
		
		// indexOf()

		int st5 = st1.indexOf("c",2);
		System.out.println(st5);
		
		
		// trim()

		
	String st6 =" Ktm ";
	String st7 = st6.trim();
	System.out.println(st6.length());
	System.out.println(st7);
	int st9 = st1.length();
	System.out.println(st1.length());
		
	System.out.println(st1.trim());
	System.out.println(st7.length());
		
	String st8 = " Genius is a boy ";
	int st11 = st8.length();
	System.out.println(st11);
	String st10 = st8.trim();
	System.out.println(st10);
	int st12 = st10.length();
	System.out.println(st12);
	
	// split()
	 String st13 = "Genius-is-a-boy";
	 String[] result11 = st13.split("i");
	 System.out.println(result11[0]);
	 System.out.println(result11[1]);
	   System.out.println(result11[2]);
	
	 //join
	 
	 String st14 = "saruguragain";
	 String st15 = st14.join("@", st14, "gmail.com");
		System.out.println(st15);
		String st16 = st14.replace("u", "v");
		System.out.println(st16);
		String st17 = st16.replace("v","u");
		System.out.println(st17);
		
		
		
		
		
		
		
		
	}

}
