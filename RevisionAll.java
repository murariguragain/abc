package javaproject;

public class RevisionAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	//Arithmetic
		System.out.println(10+10);
		System.out.println(10-10);
		System.out.println(10*10);
		System.out.println(10/10);
		System.out.println(10%10);
		
		// comparision
		
		System.out.println(5<7);
		System.out.println(!(10==10));
		System.out.println(10>=10 && 10<9);
		
		int a = 50;
		if(a<45) {
			System.out.println("b grade");
		}
		else if (a<80) {
			System.out.println("c grade");
		}
		
		else  {
			System.out.println("A grade");
		}
		
		
		
		//program
		
		String str = "apple";
		for (int i =0; i <str.length(); i++) {
			//System.out.println(i);
			System.out.println(str.charAt(i));
		}
		
		String rev = "";
		for(int i = 0; i<str.length(); i++) {
			rev = str.charAt(i) + rev;
			System.out.println(rev);
		}
		
		String rev1 = "";
		for(int i=str.length()-1; i>=0; i--) {
			System.out.println(str.charAt(i));
		}
		int [] array = {
				11,12,13,14
		};
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array.length);
		
		
		String [] names = {"hari","ram", "shyam"};
		for(String element:names) {
			System.out.println(element);
		}
				
		
		for(int element:array) {
			System.out.println(element);
		} 
		
		for(int i =0; i<names.length; i++) {
			System.out.println(names[i]);
			
		}
		
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
