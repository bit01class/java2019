package com.bit.am;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// 학생성적관리 프로그램(ver. 0.2.2)
		Scanner sc=new Scanner(System.in);
		System.out.println("-------------------------------------");
		System.out.println("학생성적관리 프로그램(ver. 0.2.2)");
		System.out.println("-------------------------------------");
		String input=null;
		int num=201901;
		List<Map<String,Integer>> data=null;
		data=new ArrayList<Map<String,Integer>>();
		
		while(true){
			System.out.print("1.보기 2.입력 3.수정 4.삭제 0.종료>");
			input=sc.nextLine();
			if(input.equals("0")){break;}
			if(input.equals("2")){
				Map<String,Integer> student=null;
				student=new HashMap<String, Integer>();
				student.put("num", num++);
				System.out.print("국어>");
				int kor=Integer.parseInt(sc.nextLine());
				student.put("kor", kor);
				System.out.print("영어>");
				int eng=Integer.parseInt(sc.nextLine());
				student.put("eng", eng);
				System.out.print("수학>");
				int math=Integer.parseInt(sc.nextLine());
				student.put("math", math);
				data.add(student);
			}else if(input.equals("1")){
				System.out.println("-------------------------------------");
				System.out.println("학번\t국어\t영어\t수학");
				System.out.println("-------------------------------------");
				for(int i=0; i<data.size(); i++){
					Map<String,Integer> stu=data.get(i);
					System.out.print(stu.get("num"));
					System.out.print("\t");
					System.out.print(stu.get("kor"));
					System.out.print("\t");
					System.out.print(stu.get("eng"));
					System.out.print("\t");
					System.out.println(stu.get("math"));
				}
				System.out.println("-------------------------------------");
			}else if(input.equals("3")){
				System.out.print("학번>");
				int target=Integer.parseInt(sc.nextLine());
				for(int idx=0; idx<data.size(); idx++){
					if(target==data.get(idx).get("num")){
						Map<String, Integer> stu = data.get(idx);
						System.out.print("국어>");
						int kor=Integer.parseInt(sc.nextLine());
						stu.put("kor", kor);
						System.out.print("영어>");
						int eng=Integer.parseInt(sc.nextLine());
						stu.put("eng", eng);
						System.out.print("수학>");
						int math=Integer.parseInt(sc.nextLine());
						stu.put("math", math);	
						break;
					}
				}
			}else if(input.equals("4")){
				System.out.print("학번>");
				int target=Integer.parseInt(sc.nextLine());
				for(int idx=0; idx<data.size(); idx++){
					Map<String,Integer> stu=data.get(idx);
					if(target==stu.get("num")){
							data.remove(idx);
							break;
					}
				}
			}
		}
		System.out.println("이용해주셔서 감사합니다");

	}

}
















