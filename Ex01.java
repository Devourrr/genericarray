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
		
		Member m = new Member("1001","kjh"); // ��ӹ޴� Ŭ���� ����, ���ÿ� ��ü ����
		disp(m); //������
//		System.out.println(m);
		
	

	}
	public static void disp(Object obj) { //������Ʈ Ŭ����
		System.out.println(obj);
//		((Score)obj).getName();
		
		if( obj instanceof Score) {
			((Score)obj).getName();
////			((Ŭ����)obj).public�޼���();
		}else if(obj instanceof Member) {
			((Member)obj).method();
		
		}
		
	}

}
