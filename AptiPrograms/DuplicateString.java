public class DuplicateString{
	public static void main(String[] args){
		String dup="My Name Is Pratheek";
		char[] ch=dup.toCharArray();
		System.out.println("The Original String is: "+dup);
		System.out.println("The Duplicate Values in String are: ");
		for(int i=0;i<dup.length();i++){
			for(int j=i+1;j<dup.length();j++){
				if(ch[i]==ch[j]){
					System.out.println(ch[j]);
					break;
				}
			}
		}
	}

}