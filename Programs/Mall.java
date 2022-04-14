class Mall{
static String name;
static String location;
static String ownerName;
static int totalShops=120;
static char open;

static void initName(String mallName){
	Mall.name=mallName;
	if(mallName!=null && mallName=="Phoenix")
	{
		System.out.println("The mall name is: "+mallName);
	}
	else
	{
		System.out.println("Invalid Name");
		//return name;
	}
	
	
}
static void initLocation(String mallLocation){
	Mall.location=mallLocation;
	if(mallLocation!=null && mallLocation=="Bengaluru")
	{
		System.out.println("Mall Location is in: "+mallLocation);
	}
	else
	{
		System.out.println("Invalid Location");
		//return location;
	}
}

static void initOwnerName(String mallOwnerName){
	Mall.ownerName=mallOwnerName;
	if(mallOwnerName!=null && mallOwnerName=="Phoenix Developers")
	{
		System.out.println("Mall OwnerName is : "+mallOwnerName);
	}
	else
	{
		System.out.println("Invalid ownerName");
		//return ownerName;
	}
}

static void initTotalShops(int mallTotalShops){
	Mall.totalShops=mallTotalShops;
	if(mallTotalShops==120)
	{
		System.out.println("Total number of Shops: "+mallTotalShops);
		
	}
	else{
		System.out.println("Invalid Shop Number");
	    //return totalShops;
	}
}
static void initOpen(char isOpen){
	Mall.open=isOpen;
	if(isOpen=='Y')
	{
		System.out.println("Mall Is Open");
	}
	else{
		System.out.println("Mall is Closed");
	}
}
static String getName()
{
	return Mall.name;
}
static String location(){
	return Mall.location;
}
static String ownerName(){
	return Mall.ownerName;
}
static int totalShops(){
	return Mall.totalShops;
}
static char open(){
	return Mall.open;
}
}