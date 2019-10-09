package cse360Assign2;

public class AddingMachine 
{
	private int total = 0;
	private String str = "0";
	
		public AddingMachine () 
		{
			  // not needed - included for clarity
		}
	
		public int getTotal () 
		{
			return this.total;
		}
	
		public void add (int value) 
		{
			this.total += value;
			this.str += "+" + value;
		}
	
		public void subtract (int value) 
		{
			this.total -= value;
			this.str += "-" + value;
		}
		
		public String toString () 
		{
			return this.str;
		}

		public void clear() 
		{
			this.total = 0;
			this.str = "0";
		}
		
		public void setTotal(int total) {
	        this.total = total;
	    }

	    public String getStr() 
	    {
	        return str;
	    }

	    public void setProcessString(String str) 
	    {
	        this.str = str;
	    }

	    public static void main(String[] args)
	    {
	        AddingMachine myCalc = new AddingMachine();
	        myCalc.add (5);
	        myCalc.subtract (2);
	        myCalc.add(5);
	        System.out.println(myCalc);
	        System.out.println(myCalc.getTotal());
	    }
}
