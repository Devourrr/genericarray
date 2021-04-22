package week5day4;
//객체배열을 정렬하는 기능을 만들어서 제공하고 싶다
public class MyArrays {

	public static void sort(Object[] arr) {
		for(int i=0; i<arr.length-1; i++) {
			for(int j=1; j<arr.length; j++) {
				
				if(( (MyComparable)arr[i]).compareTo(arr[j])>0) { //상속받아서 형변환은 가능함
					Object tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		
			
		}
	}

}
