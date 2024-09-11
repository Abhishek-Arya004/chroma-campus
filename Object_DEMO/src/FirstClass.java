
public class FirstClass {
	
	
	 int i = 100;
	 int j = 200;
	 
	 
	 FirstClass(int a , int b){
		 
		 this.display(this);
		 
		 int c= a+b;
		 
		 System.out.println("Addition od value"+ " " + c);
		 
		 		 
	 }
	 
	 
	 FirstClass(){
		 		 
		 
		 System.out.println("Default constructor"); 
		 
		 	 };
		 	 
		 	 
		 	 
		 	FirstClass(int a , int b, int c){
				 
				 int d= a+b+c;
				 
				 System.out.println("Addition od value"+ " " + d);
				 
				 		 
			 }
		 	 
		 	
		 	
		 void display(FirstClass s ) {
		 		
		 		
		 		 System.out.println("called by this");
		 		
		 	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//SecondClass t = new SecondClass();// it will create object of second class
		
		
		
//		thirdClass h = new thirdClass();
//		
		FirstClass l = new FirstClass(10, 20);
//		FirstClass l1 = new FirstClass();
//		FirstClass l2 = new FirstClass(10, 20, 30);
		
		
		SecondClass s1=new SecondClass(111,"ankit",5000f);  
		SecondClass s2=new SecondClass(112,"sumit",6000f);  
		s1.display();  
		s2.display(); 
		
		s1.rollno=200;
	   
		
		
		
		
		
//		t.addmethod(60,70); //method calling
////		h.submethod();
////		
////	
////		System.out.println(h.i);
////		System.out.println(h.j);
////		
////		
////
////		l.i=300;
////		l.j=500;
////		t.i=60;
////		t.j=70;
////			
////		
////		System.out.println(l.i);
////		System.out.println(l.j);
////		
////		System.out.println(t.i);
////		System.out.println(t.j);
//		
	}

}
