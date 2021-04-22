package week5day4;

import java.util.ArrayList;
import java.util.Collections;

class Customer implements Comparable<Customer>{

	int age;
	String name;
	public Customer(int age, String name) {
		this.age = age;
		this.name = name;
	}
	public String toString() {
		return age + " " + name;
	}
	
	@Override
	public int compareTo(Customer o) {
//		return this.age - o.age;
		return o.age - this.age;
	}
	
}

public class ArrayListSortTest2 {

	public static void main(String[] args) {
		ArrayList<Customer> list = new ArrayList<>();
		list.add(new Customer(25,"kim"));
		list.add(new Customer(32,"lee"));
		list.add(new Customer(29,"park"));
		Collections.sort(list); //error why?
		//implements Comparable<Student> 구현해야 사용가능
		//
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		

	}

}
