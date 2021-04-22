package week5day4;

public class MyArrayListGTest {

	public static void main(String[] args) {
		MyArrayListG<Member2> list = new MyArrayListG<>();
		list.add(new Member2("11111","kim"));
		list.add(new Member2("22222","lee"));
		list.add(new Member2("33313","park"));
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).getBornYear());
			System.out.println(list.get(i));
	
		}
	}

}
