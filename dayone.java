package javaproject;

public class dayone {

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










	}

}
