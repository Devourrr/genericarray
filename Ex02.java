package week05.day3;

public class Ex02 {

	public static void main(String[] args) {
		//
		//int[] arr = new int[5];
		//arr[0]=90;
		
		int[] arr= { 40,90,30,80,10};
		
		//����  ��������, ��������				
		//5    0 -> 4-1
		for( int i=0 ; i< arr.length -1 ; i++) {         // i=0   ,    1  ,    2,      3
			
			for(int j= i+1 ; j< arr.length ; j++) {     // j =1~4     i=2~4  , i=3~4  , i=4~4
				if( arr[i] > arr[j] ){				
					int tmp = arr[i];
					arr[i]= arr[j];
					arr[j]=tmp;
				}
			}
		}
		
		//���� for��   for each��, �迭�� ���� ����� ���� ����
		// for(  �ڷ��� �迭�� ��� : �迭�̸�){
		
		// }
		for( int n: arr) {
			System.out.print( n + "  ");
		}
		
		for( int i=0; i< arr.length ; i++) {
			System.out.print( arr[i] + "  ");
		}
		
		
		
		
		
		
		

	}

}
