class ChatCenter{
static String name="BTM Chat Center";
static String location="BTM";
static String[] items;
static float rating;


static void setItems(String[] items)
{
    ChatCenter.items=items;
	if(items!=null)
	{
		System.out.println("The Items are "+items.length);
	}
}	
 static double serveSnacks(String items){
	if(items!=null)
	{
      for(int index=0;index<ChatCenter.items.length;index++)
		  
	  {
		  String elements=ChatCenter.items[index];
		  if(elements.equals("Pani Puri") && elements.equals(items))
		  {
			  System.out.println(items+" Available");
			  return 30;
		  }
		  
		  if(elements.equals("Gobi") && elements.equals(items))
          {
			  System.out.println(items+" Available");
			  return 50;
		  }
		  
		  if(elements.equals("Masala Puri") && elements.equals(items))
          {
			  System.out.println(items+" Available");
			  return 35;
		  }
		  
		  if(elements.equals("Bhel Puri") && elements.equals(items))
          {
			  System.out.println(items+" Available");
			  return 40;
		  }

	  }
	  

}   		 
        else
	     {
	          System.out.println("Item Unvailable choose other item");
         }
     return -1;
}
}-+