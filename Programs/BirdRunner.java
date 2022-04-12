class BirdRunner{
public static void main(String[] values)

{
	String birdName = Bird.name;
	float birdHeight=Bird.height;
	int birdAge=Bird.age;
	double birdBeakLength=Bird.beakLength;
	String birdColour=Bird.colour;
	
	System.out.println(birdName);
	System.out.println(birdHeight);
	System.out.println(birdAge);
	System.out.println(birdBeakLength);
	System.out.println(birdColour);
	
	birdName="Piegon";
	birdHeight=10.0f;
	birdAge=3;
	birdBeakLength=2.0;
	birdColour="White";
	
	System.out.println(birdName);
	System.out.println(birdHeight);
	System.out.println(birdAge);
	System.out.println(birdBeakLength);
	System.out.println(birdColour);
	
	
	
	
	
}
}