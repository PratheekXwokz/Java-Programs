class StaticString{

public static void main(String[] args)
{


//copyValueof
char[] data={'A','B','C','D','E','F'};
String data2="";
data2=data2.copyValueOf(data);
System.out.println("The value Copied are: "+data2);


//copyValueOf with index and number of elements

char[] name={'P','R','A','T','H','E','E','K',' ','P','A','L','A','N','G','A','P','P','A'};
String name2="";
name2=name2.copyValueOf(name,0,8);
System.out.println("The First Name is: "+name2);

//String Format

String companyName="Accenture";

String s=String.format("The Company name is %s",companyName);

System.out.println(s);

//String Format Using locale

String num=String.format("The Number is %.4f",81.63);
System.out.println(num);


//String Join 

String numbers=String.join(">","Ten","Nine","Eight","Seven","Six");
System.out.println(numbers);
}


}