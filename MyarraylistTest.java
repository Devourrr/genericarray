package week5day3_arrayList;



class Member2{
	String id;
	String name;
	public Member2(String id, String name) {
		this.id = id;
		this.name = name;
	}
	public String getBornYear() {
		return id.substring(0,4);
	}
	@Override
	public String toString() {
		return id +" "+ name;
	}
}

public class MyarraylistTest {

	public static void main(String[] args) {
		
		Object obj1 = new Member2("200112104903211", "kim");
		
		MyArrayList list = new MyArrayList();
		list.add(new Member2("20011204903211","kim"));
		list.add(new Member2("20009264903211","lee"));
		list.add(new Member2("20004214903211","park"));
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i));
			Object obj = list.get(i);
			Member2 tmp = (Member2)obj;
//			tmp.getBornYear()
			//제네릭 아닌 버전은 가져올때 cast해줘야하는 번거로움이 있다
			
		}

	}

}
