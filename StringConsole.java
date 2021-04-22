package week05.day3;

import java.util.Scanner;

public class StringConsole {

	
	public static void main(String[] args) {
		
		String[] arr = new String[5];
		Scanner sc = new Scanner( System.in);

		for( int i=0; i< arr.length; i++)
		{    System.out.print("이름입력:");
		     String name = sc.next();
		     arr[i]= name;  
		    // arr[i] = sc.next();	
		}
		
		for( String s: arr) 
		  System.out.print( s + " " ); 
		
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

		System.out.println("정렬후 ===>"); 
		for( String s: arr) 
		  System.out.print( s + " " ); 
	}
	
}
