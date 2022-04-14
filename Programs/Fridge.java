class Fridge{
	
	static String company;
	static int capacity;
	static double price;
	
	static void init(String company)
	{
	Fridge.company=company;
	System.out.println("The Company name is: "+Fridge.company);
	}
	
	static void init(int capacity)
	{
	Fridge.capacity=capacity;
	System.out.println("The Capacity is: "+Fridge.capacity);
	}
	
	static void initPrice(double price)
	{
	Fridge.price=price;
	System.out.println("The Price is: "+Fridge.price);
	}
	
	static void init(String company,int capacity,double price)
	{
	System.out.println("The Properties of a Fridge are: "+company+" "+capacity+" "+price);
	}
}