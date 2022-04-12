class ArrayChar{
public static void main(String[] values)
{
  char[] elements={'A','B','C','D','F','P','R','O','G','H'};
  
  System.out.println(elements.length);
  System.out.println(elements[0]);
  System.out.println(elements[1]);
  System.out.println(elements[2]);
  System.out.println(elements[3]);
  System.out.println(elements[4]);
  System.out.println(elements[5]);
  System.out.println(elements[6]);
  System.out.println(elements[7]);
  System.out.println(elements[8]);
  System.out.println(elements[9]);
  
    elements[2]='K';
   System.out.println("The element at index 2 is replaced by: "+ elements[2]);
   
   elements[5]='V';
   System.out.println("The element at index 5 is replaced by: "+ elements[5]);
   
   
  elements[8]='L';
  System.out.println("The Element at Index 8 is replaced by: "+ elements[8]);
	
  
}
}