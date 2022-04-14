class PayingGuest{
    
	static String name="Arasan Gents PG";
	static String location="BTM 1st Stage";
	static int doorNo=12;
	static int totalRoom=20;
	
	static void details()
	{
		System.out.println(name);
		System.out.println(location);
		System.out.println(doorNo);
		System.out.println(totalRoom);
		
	}
	
	public static void admission(String personName,String idProof)
	{
		//System.out.println(personName+" "+idProof);
		System.out.println(personName);
		System.out.println(idProof);
	}
}