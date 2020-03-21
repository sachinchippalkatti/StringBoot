package com.sachin.test;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class TestMethod {
	
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		int n = keyboard.nextInt();
		int q = keyboard.nextInt();
		TreeSet<Integer> roadway = new TreeSet<Integer>();
        TreeSet<Integer> railway = new TreeSet<Integer>();
		while(q-- > 0) {
			int k = keyboard.nextInt(), u = keyboard.nextInt(), v = keyboard.nextInt();
			if(k == 1) {
				railway.add(u);
				railway.add(v);
			}
			else {
				roadway.add(u);
				roadway.add(v);
			}
			if(railway.size() == roadway.size()) {
				int flag = 0;
				Iterator<Integer> itr = railway.iterator();
				while(itr.hasNext()) {
					int city = itr.next();
					if(roadway.contains(city) == false) {
						System.out.println("NO");
						flag = 1;
						break;
					}
				}
				if(flag == 0)
					System.out.println("YES");
			}
			else
				System.out.println("NO");
		}
	}
}
