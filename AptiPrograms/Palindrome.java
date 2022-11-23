public class Palindrome{
	public static boolean pal(String str){
		String rev=" ";
		
		boolean ans=false;
		for(int i=str.length()-1;i>=0;i--){
			rev =rev+str.charAt(i);
		}
		
		
		if(str.equals(rev)){
			ans=true;
			
		}return ans;
	}
		public static void main(String[] args){
			String str="pratheek";
			str=str.toLowerCase();
			boolean a=pal(str);
			System.out.println(a);
			
		}
		
	}