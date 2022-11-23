public class EqualityOfArrays{
	public static void main(String[] args){
		int[] a={2,3,4,5,6,7};
		int[] b={2,3,4,5,7,7};
		
		boolean result=true;
		if(a.length==b.length){
			for(int i=0;i<a.length;i++){
				if(a[i] != b[i]){
					result=false;
				}
			}
		}
		else{
			result=false;
		}
		if(result==true){
			System.out.println("Arrays are equal");
		}
		else{
			System.out.println("Arrays are not equal");
			
		}
	}
}