package week5day4;

class Scores implements Comparable<Scores>{
	String name;
	int kor;
	
	public Scores(String name, int kor) {
		this.name = name;
		this.kor = kor;
	}
	public String toString() {
		return name + " " + kor;
		
	}
//	@Override
//	public int compareTo(Object obj) {
//		Scores tmp = (Scores)obj;
//		//return this.kor - tmp.kor;
//		return this.name.compareTo(tmp.name);
//	}
	@Override
	public int compareTo(Scores i) {
		// TODO Auto-generated method stub
		return this.kor - i.kor;
	}
}

public class MyArraysTest {

	public static void main(String[] args) {
		//객체배열 정렬하기
		Score[] arr = new Score[3];
		arr[0] = new Score("lee11",87);
		arr[1] = new Score("park11",99);
		arr[2] = new Score("kim11",90);
		
		//객체배열정렬
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				if(arr[i].kor> arr[j].kor) {
					Score tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
							
				}
			}
		}
		MyArrays.sort(arr);
		for(Score c:arr) {
			System.out.println(c);
		}

	}

}


