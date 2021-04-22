package week5day4;

class Score{
	
	String name;
	int kor;
	
	public Score(String name, int kor) {
		this.name = name;
		this.kor = kor;
	}
	@Override
	public String toString() {
		return name +" " + kor;
	}
	public String getName() {
		return name;
	}
}

class Member{
	String id;
	String name;
	public Member(String id, String name) {
		this.id = id;
		this.name = name;
		
	}
	
	@Override
	public String toString() {
		return id + " " + name;
	}
	public void method() {
		
	}
}

public class Ex01 {

	public static void main(String[] args) {
		
		Score s = new Score("kim",90);
		disp(s);
//		System.out.println(s);
		
		Member m = new Member("1001","kjh"); // 상속받는 클래스 정의, 동시에 객체 생성
		disp(m); //다형성
//		System.out.println(m);
		
	

	}
	public static void disp(Object obj) { //오브젝트 클래스
		System.out.println(obj);
//		((Score)obj).getName();
		
		if( obj instanceof Score) {
			((Score)obj).getName();
////			((클래스)obj).public메서드();
		}else if(obj instanceof Member) {
			((Member)obj).method();
		
		}
		
	}

}
