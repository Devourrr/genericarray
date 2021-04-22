package week5day4;

public class StringSortTest {

	public static void main(String[] args) {
		
		String[] arr = {"Tesla", "Apple","Nvidia","Alphabet A","SpaceX"};
		
		System.out.println("정렬전:");
		for(String s: arr) { //:문법, 배열요소s를 하나씩 꺼내줌
			System.out.println(s + " ");
		}
		
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				
				if(arr[i].compareTo(arr[j])>0) { // 오름차순정렬 (문자열 비교값이 양수일경우)
					String tmp = arr[i]; //tmp라는 임시변수를 만들어 arr[i]와 arr[j]를 교환
					arr[i] = arr[j];
					arr[j]=tmp;
				}
			}
		}
		System.out.println("정렬후:");
		for(String s: arr) {
			System.out.println(s+ " ");
		}

	}

}
