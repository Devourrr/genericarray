package week5day4;
//��ü�迭�� �����ϴ� ����� ���� �����ϰ� �ʹ�
public class MyArrays {

	public static void sort(Object[] arr) {
		for(int i=0; i<arr.length-1; i++) {
			for(int j=1; j<arr.length; j++) {
				
				if(( (MyComparable)arr[i]).compareTo(arr[j])>0) { //��ӹ޾Ƽ� ����ȯ�� ������
					Object tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		
			
		}
	}

}
