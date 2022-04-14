class PropertiesRunner{
public static void main(String[] values){
Shirt.size='L';
Shirt.colour="Green";
Shirt.sleeve="Half";
Shirt.price=999;
Shirt.brand="Nike";

Shirt.properties();

System.out.println("********End OF LIne************");

//Chappal Properties

Chappal.size=8;
Chappal.colour="Green";
Chappal.style="Flat";
Chappal.price=700;
Chappal.brand="Puma";

Chappal.properties();

System.out.println("********End OF LIne************");


//Warch Properties

Watch.material="Steel";
Watch.colour="Black";
Watch.style="Digital";
Watch.price=8000;
Watch.brand="Casio";

Watch.properties();
System.out.println("********End OF LIne************");

//EarphoneProperties

Earphone.earBudSize='S';
Earphone.colour="White";
Earphone.style="Bluetooth";
Earphone.price=1400;
Earphone.brand="Boat";

Earphone.properties();
System.out.println("********End OF LIne************");

//BagProperties

Bag.capacity=45;
Bag.colour="Blue";
Bag.style="Rucksack";
Bag.price=4000;
Bag.brand="WildCraft";

Bag.properties();
System.out.println("********End OF LIne************");




}

}