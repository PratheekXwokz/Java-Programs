class ChatCenterRunner{

public static void main(String[] args)
{
	ChatCenter.rating=4.5f;
	System.out.println(ChatCenter.rating);
	
	String[] items={"Pani Puri","Gobi","Masala Puri","Bhel Puri"};
	
	ChatCenter.setItems(items);
	System.out.println(items);
	
	ChatCenter.serveSnacks("Masala Chat");
	
	
	ChatCenter.serveSnacks("Gobi");
	ChatCenter.setItems(items);
	String itemPassed=args[0];
	double price=ChatCenter.serveSnacks(itemPassed);
	System.out.println(price);
	
}
}
