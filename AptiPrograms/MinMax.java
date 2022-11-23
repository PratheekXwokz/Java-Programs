public class MinMax{
	
	public int max(int[] array){
		int max=0;
		
		for(int i=0;i<array.length;i++){
			if (array[i]>max){
			max=array[i];
		}
	}
	return max;
	}
	
	public int min(int[] array){
		int min=array[0];
		
		for(int i=0;i<array.length;i++){
			if(array[i]<min){
				min=array[i];
			}
		}
		return min;
	}
	
public static void main(String args[]){
	int[] array={23,45,43,67,55,98};
	MinMax small=new MinMax();
	System.out.println("The Maximum value in array is: "+small.max(array));
	System.out.println("The Minimum value in array is: "+small.min(array));
}
}