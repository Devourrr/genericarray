package week05.day3;

import java.util.Scanner;

public class StringConsole {

	
	public static void main(String[] args) {
		
		String[] arr = new String[5];
		Scanner sc = new Scanner( System.in);

		for( int i=0; i< arr.length; i++)
		{    System.out.print("�̸��Է�:");
		     String name = sc.next();
		     arr[i]= name;  
		    // arr[i] = sc.next();	
		}
		
		for( String s: arr) 
		  System.out.print( s + " " ); 
		
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

		System.out.println("������ ===>"); 
		for( String s: arr) 
		  System.out.print( s + " " ); 
	}
	
}
