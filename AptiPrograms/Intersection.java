public class Intersection{
	public static void main(String args[]){
		int[] inter1={24,34,56,54,67,87,21};
		int[] inter2={34,56,99,1,3,5,67};
		
		for(int i=0;i<inter1.length;i++){
			for(int j=0;j<inter2.length;j++){
				if(inter1[i]==inter2[j]){
					System.out.println(inter2[j]);
				}
			}
		}
	}
	

}