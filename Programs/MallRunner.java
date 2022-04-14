class MallRunner{
public static void main(String[] values)
{
	Mall.initName("Phoenix");
	String name=Mall.getName();
	System.out.println(name);
	Mall.initLocation("Bengaluru");
	Mall.initOwnerName("Phoenix Developers");
	Mall.initTotalShops(120);
	Mall.initOpen('Y');
}
}