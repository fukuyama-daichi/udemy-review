package demo;

import java.util.ArrayList;

import entity.Member;
import service.MemberServiceImpl;

public class Main {

	public static void main(String[] args) {

		MemberServiceImpl service = MemberServiceImpl.getInstance();
		System.out.println(service.greet(2));
		System.out.println(service.getAll());
		ArrayList<Member> list = service.getAll();
		for (Member m : list) {
			System.out.println(m.getId() + ", " + m.getName() + ", " + m.getEmail());
		}

		System.out.println(service.sumOf(1, 10));
	}

}
