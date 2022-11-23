public class Occurence{
public static void main(String[] args){
	String str="My Name is Pratheek";
	char ch='a';
	int count=0;
	
	for(int i=0;i<str.length();i++){
		if(str.charAt(i)==ch){
			count++;
		}
	}
	System.out.println("Th occurence of Given Character"+ch+"in given string is "+count);
}
}