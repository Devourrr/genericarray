package week05.day3;

public class StringCompareTest {

	public static void main(String[] args) {
	 
		String[]  arr = {   "banana" , "tomato"  , "apple"};
		
		for( String s : arr) {
			System.out.print( s + "   ");			
		}		
		//정렬 
		for(int i=0; i< arr.length -1 ; i++) {			
			for( int j= i+1 ; j< arr.length ; j++) {
				if( arr[i].compareTo(arr[j])  > 0 ) { // 오름차순 
					String tmp;
					tmp = arr[i];
					arr[i]= arr[j];
					arr[j] = tmp;
				}
			}			
		}		
		//정렬 후 
		System.out.println("정렬후 ===>");
		for( String s : arr) {
			System.out.print( s + "   ");			
		}
		
		

	}

}
