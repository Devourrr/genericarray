package week5day4;

public class StringSortTest {

	public static void main(String[] args) {
		
		String[] arr = {"Tesla", "Apple","Nvidia","Alphabet A","SpaceX"};
		
		System.out.println("������:");
		for(String s: arr) { //:����, �迭���s�� �ϳ��� ������
			System.out.println(s + " ");
		}
		
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				
				if(arr[i].compareTo(arr[j])>0) { // ������������ (���ڿ� �񱳰��� ����ϰ��)
					String tmp = arr[i]; //tmp��� �ӽú����� ����� arr[i]�� arr[j]�� ��ȯ
					arr[i] = arr[j];
					arr[j]=tmp;
				}
			}
		}
		System.out.println("������:");
		for(String s: arr) {
			System.out.println(s+ " ");
		}

	}

}
