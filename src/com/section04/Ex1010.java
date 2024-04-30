package com.section04;

import java.util.Date;

public class Ex1010 {

	public static void main(String[] args) {
		Date d1 = new Date();
		System.out.println(d1);
		
		long ms = System.currentTimeMillis();
		System.out.println("현재 ms: " + ms);
		
		Date d2 = new Date(ms);
		System.out.println(d2);
		
		// My
		Date this_baby = new Date(2024, 12, 24);
		Date My_baby = new Date(1981, 12, 24);
		
		boolean after = this_baby.after(My_baby);
		boolean before = this_baby.before(My_baby);
		
		System.out.println(this_baby);
		System.out.println("after: " + after);
		System.out.println("before: " + before);
	}

}
