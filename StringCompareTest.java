package week05.day3;

public class StringCompareTest {

	public static void main(String[] args) {
	 
		String[]  arr = {   "banana" , "tomato"  , "apple"};
		
		for( String s : arr) {
			System.out.print( s + "   ");			
		}		
		//���� 
		for(int i=0; i< arr.length -1 ; i++) {			
			for( int j= i+1 ; j< arr.length ; j++) {
				if( arr[i].compareTo(arr[j])  > 0 ) { // �������� 
					String tmp;
					tmp = arr[i];
					arr[i]= arr[j];
					arr[j] = tmp;
				}
			}			
		}		
		//���� �� 
		System.out.println("������ ===>");
		for( String s : arr) {
			System.out.print( s + "   ");			
		}
		
		

	}

}
