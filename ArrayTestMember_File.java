package week5day4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

class Member2{
	String id;
	String name;
	
	public Member2(String id, String name) {
		this.id = id;
		this.name = name;
	}
	public String getBornYear() {
		return id.substring(0, 4);
	}
	@Override
	public String toString() {
		return id + " " + name;
	}
}

public class ArrayTestMember_File {

	public static void main(String[] args) throws FileNotFoundException {
		ArrayList<Member2>list = new ArrayList<>();
		Scanner sc = new Scanner(new File("member.txt"));
		
		while(sc.hasNext()) {
			String input = sc.nextLine();
			System.out.println(input);
			
			Scanner sc2 = new Scanner(input).useDelimiter(".");
			String id = sc2.next(); //주민번호
			String name = sc2.next(); //이름
			
			Member2 member = new Member2(id, name);
			list.add(member);
		}
		for (int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
			System.out.println(list.get(i).getBornYear());
		}

	}

}
