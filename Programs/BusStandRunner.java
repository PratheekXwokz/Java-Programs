class BusStandRunner{
	public static void main(String[] args){
		BusStand stand=new BusStand();
		System.out.println(stand.name);
		System.out.println(stand.noOfBuses);
		System.out.println(stand.totalSeat);
		
		BusStand stand1=new GovtBusStop();
		stand1.name="Shantinagar Bus Stand";
		stand1.noOfBuses=new String[4];
		stand1.noOfBuses[0]="365J";
		stand1.totalSeat=50;
		System.out.println(stand1.name);
		System.out.println(stand1.noOfBuses[0]);
		System.out.println(stand1.totalSeat);
		
		GovtBusStop stand2=(GovtBusStop)stand1;
		System.out.println(stand2.inauguratedBy);
		
		System.out.println("$$$$$$$$$$$$$$$$$$$$$");
		
		BusStand stand3=new PrivateBusStand();
		stand1.name="SadaShivNagar Bus Stand";
		stand1.noOfBuses=new String[4];
		stand1.noOfBuses[0]="A3";
		stand1.totalSeat=40;
		System.out.println(stand1.name);
		System.out.println(stand1.noOfBuses[0]);
		System.out.println(stand1.totalSeat);

		
		PrivateBusStand stand4=(PrivateBusStand)stand3;
		System.out.println(stand4.ac);
		
		
		
		
		
	}
}