class EmailData{
public static void main (String[] values)
{
   String[]	mailId={
		             "pratheekkc13@gmail.com","vivekmachaih@gmail.com","naveen@gmsil.com","jaydeepjd@gmail.com","rahulrider@hmail.com","shashankhj@gmail.com","prajwalindian@gmail.com",
		              "sedhubharathy@gmail.com","nikhilkumar@gmail.com","samsonajs@gmail.com"};
		
	for(int i=0;i<mailId.length;i++)
	{	
	System.out.println(mailId[i]);
	}
	{
		System.out.println("**End of Line**");
		
	}
	mailId[3]="sindhubn@gmail.com";
	mailId[4]="poojitha@gmail.com";
	mailId[9]="prokshithkm@gmail.com";
	
	for(int i=0;i<mailId.length;i++)
	{
		System.out.println(mailId[i]);

    }
}
}