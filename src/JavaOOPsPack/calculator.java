package JavaOOPsPack;

public class calculator {

	/* public void sum(int n1,int n2)
	  {
	    System.out.println("sum(int,int)");
	  }
	*/
	  public void sum(int n1, int n2, int n3)
	  {
	       System.out.println("sum(int,int,int)");
	  }

	  
	  public void sum(double n1,int n2) {
		  System.out.println("sum(double,int)");
	  
	 }
	  
	  /*public void sum(int n1, double n2) {
		  System.out.println("sum(int,double)");
	  }
	  */
	  public static void main(String[] args){
	    calculator c = new calculator();
	    c.sum(100,200);
	    c.sum(100,200,300);
	    c.sum(20.5, 100);

	}

}
