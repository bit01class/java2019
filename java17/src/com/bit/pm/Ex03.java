package com.bit.pm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student{
	private int num;
	String name;
	int kor;
	int eng;
	int math;
	
	public Student(int num) {
		this.num=num;
	}
	
	public int getNum(){
		return this.num;
	}
	
	public void say(){
		System.out.println(num+"\t"+name+"\t"+kor+"\t"+eng+"\t"+math);
	}
}

public class Ex03 {

	public static void main(String[] args) {
		// 성적관리프로그램 (ver 1.2.1)
				// 1.보기 2.입력 3.수정 4.삭제 0.종료>
				List<Student> data=new ArrayList<Student>();
				Scanner sc = new Scanner(System.in);
				
				System.out.println("---------------------------------");
				System.out.println("성적관리프로그램 (ver 1.2.0)");
				System.out.println("---------------------------------");
				String input=null;
				int num=201900;
				while(true){
					System.out.print("1.보기 2.입력 3.수정 4.삭제 0.종료>");
					input=sc.nextLine();
					if(input.equals("0")){break;}
					if(input.equals("1")){
						System.out.println("---------------------------------");
						System.out.println("학번\t이름\t국어\t영어\t수학");
						System.out.println("---------------------------------");
						for(int i=0; i<data.size(); i++){
							Student stu = data.get(i);
							stu.say();
						}
					}else if(input.equals("2")){
						num++;
						Student stu=new Student(num);
						System.out.print("이름>");
						stu.name=sc.nextLine();
						System.out.print("국어>");
						stu.kor=Integer.parseInt(sc.nextLine());
						System.out.print("영어>");
						stu.eng=Integer.parseInt(sc.nextLine());
						System.out.print("수학>");
						stu.math=Integer.parseInt(sc.nextLine());
						data.add(stu);
					}else if(input.equals("3")){
						System.out.print("학번>");
						int target=Integer.parseInt(sc.nextLine());
						int i=0;
						for(i=0; i<data.size(); i++){
							if(target==data.get(i).getNum()){break;}
						}
						if(i==data.size()){continue;}
						Student stu = data.get(i);
						System.out.print("국어>");
						stu.kor=Integer.parseInt(sc.nextLine());
						System.out.print("영어>");
						stu.eng=Integer.parseInt(sc.nextLine());
						System.out.print("수학>");
						stu.math=Integer.parseInt(sc.nextLine());
					}else if(input.equals("4")){
						System.out.print("학번>");
						input=sc.nextLine();
						int target=Integer.parseInt(input);
						int i=0;
						for(i=0; i<data.size(); i++){
							if(target==data.get(i).getNum()){break;}
						}
						if(i==data.size()){continue;}
						data.remove(i);
					}
				}
				System.out.println("이용해주셔서 감사합니다");

	}

}



















