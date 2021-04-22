package week5day4;

import java.util.ArrayList;
import java.util.Collections;



class Student implements Comparable<Student>{
	String name;
	int kor;
	int eng;
	int tot;
	double avg;
	char grade;
	
	public Student(String name, int kor, int eng) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}
	
	public void calcGrade() {
		tot = kor + eng;
		avg = tot/2.0;
		if(avg >=90)
			grade = 'A';
		else if(avg >=80)
			grade = 'B';
		else if(avg>=70)
			grade = 'C';
		else
			grade = 'D';
	}
	@Override
	public String toString() {
		return name + " " +kor +" " + eng+" " + tot +" " + avg + " " + grade;
	}

	@Override
	public int compareTo(Student o) {
		
		return this.tot - o.tot;
	}
}

public class StudentTest {
	public static void main(String[]args) {
		ArrayList<Student> list = new ArrayList<>();
		//데이터 입력
		list.add(new Student("kim",100,90));
		list.add(new Student("lee",82,77));
		list.add(new Student("park",79,61));
		list.add(new Student("jung",68,40));
		
		//계산
		for(int i=0; i< list.size(); i++) {
			list.get(i).calcGrade();
		}
		//정렬
		Collections.sort(list); //comparable 구현한 것들만 사용가능
		
		//출력
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
