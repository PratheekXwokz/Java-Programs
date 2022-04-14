class LaptopRunner{
public static void main(String[] values)
{
	String laptopBrandName=Laptop.brand;
	float laptopSize=Laptop.size;
	int ramsize=Laptop.ram;
	int romsize=Laptop.rom;
	String laptopColour=Laptop.colour;
	int graphicscard=Laptop.graphicsCard;
	int battery=Laptop.battery;
	String laptopOs=Laptop.os;
	String laptopProcessor=Laptop.processor;
	double laptopPrice=Laptop.price;
	String laptopVersion =Laptop.version;
	String camera=Laptop.camera;
	String warranty=Laptop.warranty;
	String type=Laptop.type;
	boolean ssd=Laptop.ssd;
	
	System.out.println(laptopBrandName);
	System.out.println(laptopSize);
	System.out.println(ramsize);
	System.out.println(romsize);
	System.out.println(laptopColour);
	System.out.println(graphicscard);
	System.out.println(battery);
	System.out.println(laptopOs);
	System.out.println(laptopProcessor);
	System.out.println(laptopPrice);
	System.out.println(laptopVersion);
	System.out.println(camera);
	System.out.println(warranty);
	System.out.println(type);
	System.out.println(ssd);
	
	
	laptopBrandName="Lenovo";
	ramsize=16;
	romsize=2048;
	laptopColour="Silver";
	laptopOs="linux";
	laptopPrice=80000;
	ssd=true;
	
	
	System.out.println(laptopBrandName);
	System.out.println(laptopSize);
	System.out.println(ramsize);
	System.out.println(romsize);
	System.out.println(laptopColour);
	System.out.println(graphicscard);
	System.out.println(battery);
	System.out.println(laptopOs);
	System.out.println(laptopProcessor);
	System.out.println(laptopPrice);
	System.out.println(laptopVersion);
	System.out.println(camera);
	System.out.println(warranty);
	System.out.println(type);
	System.out.println(ssd);
	
}

}