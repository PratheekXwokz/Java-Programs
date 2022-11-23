import java.util.*;
public class Sort{
public int[] move(int[] array){
	Arrays.sort(array);
	return move;
}
public static void main(String[] args){
	int[] arr={-1,3,4,5,-67,23,-34,-76,86,56};
	Sort sort=new Sort();
	int[] s=sort.move(arr);
	for(int i=0;i<s.length;i++){
		System.out.println(s[i]);
	}
	
}
}