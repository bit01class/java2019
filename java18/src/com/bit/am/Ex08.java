package com.bit.am;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Ex08 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("-------------------------------------");
		System.out.println("학생성적관리 프로그램(ver. 0.2.2)");
		System.out.println("-------------------------------------");
		String input=null;
		int num=201901;
		Map<Integer,Map<String,Integer>> data=null;
		data=new TreeMap<Integer,Map<String,Integer>>();
		
		while(true){
			System.out.print("1.보기 2.입력 3.수정 4.삭제 0.종료>");
			input=sc.nextLine();
			if(input.equals("0")){break;}
			if(input.equals("2")){
				Map<String,Integer> student=null;
				student=new HashMap<String, Integer>();
				System.out.print("국어>");
				int kor=Integer.parseInt(sc.nextLine());
				student.put("kor", kor);
				System.out.print("영어>");
				int eng=Integer.parseInt(sc.nextLine());
				student.put("eng", eng);
				System.out.print("수학>");
				int math=Integer.parseInt(sc.nextLine());
				student.put("math", math);
				data.put(num++, student);
			}else if(input.equals("1")){
				System.out.println("-------------------------------------");
				System.out.println("학번\t국어\t영어\t수학");
				System.out.println("-------------------------------------");
				Set<Integer> keys = data.keySet();
				Iterator<Integer> ite = keys.iterator();
				while(ite.hasNext()){
					int key=ite.next();
					Map<String,Integer> stu=data.get(key);
					System.out.print(key);
					System.out.print("\t");
					System.out.print(stu.get("kor"));
					System.out.print("\t");
					System.out.print(stu.get("eng"));
					System.out.print("\t");
					System.out.println(stu.get("math"));
				}
			}
		}
	}

}













