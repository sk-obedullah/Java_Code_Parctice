package com.CodePractice.leetcode;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		
		Set<String> a=new TreeSet<>();
		a.add("elem1");
		a.add("elem2");
		a.add("elem3");
		a.add("elem45");
		a.add("elem5");
		
		Set<String> b=new TreeSet<>();
		b.add("elem1");
		b.add("elem2");
		b.add("elem3");
		b.add("elem4");
		b.add("elem5");
		
		validate(a,b);
	}
	
	public static Collection<?> validate(Set<String> excelCols, Set<String> actualCols) {

		if(excelCols.equals(actualCols)) {
			if(excelCols.contains(actualCols))
			return new ArrayList<>();
			else {
			 excelCols.remove(actualCols);
				return excelCols;
			}
		}else if(excelCols.size()<actualCols.size()) {
			//returning missing val
			actualCols.removeAll(excelCols);
			return actualCols;
		}else {
			excelCols.remove(actualCols);
			//returning extra val
			return excelCols;
		}
		
	}
}
















