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
		System.out.println("�л��������� ���α׷�(ver. 0.2.2)");
		System.out.println("-------------------------------------");
		String input=null;
		int num=201901;
		Map<Integer,Map<String,Integer>> data=null;
		data=new TreeMap<Integer,Map<String,Integer>>();
		
		while(true){
			System.out.print("1.���� 2.�Է� 3.���� 4.���� 0.����>");
			input=sc.nextLine();
			if(input.equals("0")){break;}
			if(input.equals("2")){
				Map<String,Integer> student=null;
				student=new HashMap<String, Integer>();
				System.out.print("����>");
				int kor=Integer.parseInt(sc.nextLine());
				student.put("kor", kor);
				System.out.print("����>");
				int eng=Integer.parseInt(sc.nextLine());
				student.put("eng", eng);
				System.out.print("����>");
				int math=Integer.parseInt(sc.nextLine());
				student.put("math", math);
				data.put(num++, student);
			}else if(input.equals("1")){
				System.out.println("-------------------------------------");
				System.out.println("�й�\t����\t����\t����");
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













