package com.vtsrise.impl;

public class StringArray {
	public void findMissing(String x,String y) {
		char a[] = x.toCharArray();
		char b[] = y.toCharArray();
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			int j;
			for (j = 0; j < b.length; j++)
				if (a[i] == b[j]) {
					count++;
					break;
				}
			if (j == b.length)
				System.out.println(a[i] + " ");
		}
		if(count == a.length) {
			System.out.println("NULL");
		}
	}
}
