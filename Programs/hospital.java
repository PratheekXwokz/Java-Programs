class Hospital{

static String name="Manipal Hospitals";
static String location="Bengaluru";
static String specializtion="Multi Speciality";
static int numberOfBeds=600;

	static void details()
	{
		System.out.println(name);
		System.out.println(location);
		System.out.println(specializtion);
		System.out.println(numberOfBeds);
		
	}
	
	static void admitPatient(String patientName,String reason,double advancePayment)
	{
		System.out.println(patientName+" has been admiited due to"+" "+reason+" "+"and has made an advance payment of "+advancePayment);
	}
}