class Pipe{
	static int length;
	static double diameter;
	static String colour;
	static String material;
	
	static void initLength(int length)
	{
	if(length>0 && length <=20)
	{
		Pipe.length=length;
		System.out.println("The Length of the pipe is: "+Pipe.length);
	}
	else
	{
		System.out.println("Invalid Length: "+length);
	}
	}
	
	static void initDia(double diameter)
	{
	if(diameter>0 && diameter <=15)
	{
		Pipe.diameter=diameter;
		System.out.println("The diameter of the pipe is: "+Pipe.diameter);
	}
	else
	{
		System.out.println("Invalid diameter: "+diameter);
	}
	}
	
	static void initColour(String colour)
	{
	if(colour != null && colour=="Grey" || colour=="Blue" || colour=="Black")
	{
		Pipe.colour=colour;
		System.out.println("The Colour of the pipe is: "+Pipe.colour);
	}
	else
	{
		System.out.println("Invalid colour: "+colour);
	}
	}
	
	static void initMaterial(String material)
	{
	if(material != null && material=="PVC" || material=="Alluminium" || material=="Fibre")
	{
		Pipe.material=material;
		System.out.println("The material of the pipe is: "+Pipe.material);
	}
	else
	{
		System.out.println("Invalid material: "+material);
	}
	}
	
	static void init(int length,double diameter,String colour,String material)
	{
		if((length>0 && length <=20) && (diameter>0 && diameter <=15) &&(colour != null && colour=="Grey" || colour=="Blue" || colour=="Black") &&(material != null && material=="PVC" || material=="Alluminium" || material=="Fibre"))
		{ 
	      Pipe.length=length;
		  Pipe.diameter=diameter;
		  Pipe.colour=colour;
		  Pipe.material=material;
		  System.out.println("The Properties of the Pipe are: "+Pipe.length+","+Pipe.diameter+","+Pipe.colour+","+Pipe.material);
		}
		else
		{
			System.out.println("Invalid Properties");
		}
		    
	
	     
}
}