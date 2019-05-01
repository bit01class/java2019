package com.bit.pm;

import java.util.Arrays;
import java.util.List;

public class Ex08 {

	public static void main(String[] args) {
//		java.util.Arrays
		char[] target={'a','b','c','d'};
		System.out.println(Arrays.toString(target));
		
		List<Character> list=Arrays.asList('A','B','C','D','E');
		
		Object[] arr = list.toArray();
		
		System.out.println(Arrays.toString(arr));
		String[] sts=new String[4];
		Arrays.fill(sts,1,3, "test");
		System.out.println(Arrays.toString(sts));
		System.out.println("----------------------------------");

		char[] target2={'a','b','c','d'};
		System.out.println(target==target2);
		System.out.println(target.equals(target2));
		System.out.println(Arrays.equals(target, target2));
		Test test1=new Test(4);
		Test test2=new Test(1);
		Test test3=new Test(2);
		Test[] target3={test1,test2,test3};
		Test[] target4={test1,test2,test3};
		System.out.println(Arrays.equals(target3, target4));
		System.out.println("----------------------------------");
		
		int[] target5={1,32,5,23,11};
		System.out.println(Arrays.toString(target5));
		Arrays.sort(target5);
		System.out.println(Arrays.toString(target5));
		System.out.println("----------------------------------");
		System.out.println(Arrays.binarySearch(target5, 32));
	}

	static class Test implements Comparable<Test>{
		int val;
		
		public Test(int val) {
			this.val=val;
		}

		@Override
		public int compareTo(Test o) {
			
//			return this.val-((Test)o).val;
			return o.val-this.val;
		}
		
		public String toString(){
			return val+"";
		}
		
	}
}




























