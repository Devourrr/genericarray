package week5day4;

import java.util.Arrays;

class Score2  implements MyComparable{
	String name;
	int kor;
	
	public Score2(String name, int kor) {
			this.name = name;
			this.kor=kor;
	
}
	public String toString() {
		return name + " " + kor;
	}
	@Override
	public int compareTo(Object obj) {
		Score2 tmp = (Score2)obj; //Çüº¯È¯
//		return this.kor-tmp.kor;
		return this.name.compareTo(tmp.name);
//		return this.kor - tmp.kor;
	}

public class MyArrayListTest2 {
	public void main(String[]args) {
		
		Score2[]arr = new Score2[3];
		arr[0] = new Score2 ("kim",80);
		arr[1] = new Score2 ("lee",100);
		arr[2] = new Score2 ("park",79);
		
//		for(int i=0; i< arr.length; i++) {
//			for(int j=i+1; j<arr.length; j++) {
//				if(arr[i].name.compareTo(arr[j].name)>0) {
//					Score2 tmp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = tmp;
//				}
//			}
//		}
		
//		MyArrays.sort(arr);
		Arrays.sort(arr);
		//MyArrays.sort(arr);
		for(Score2 c:arr) {
			System.out.println(c);
		}
	}
	
}
}
