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
		// �����������α׷� (ver 1.2.1)
				// 1.���� 2.�Է� 3.���� 4.���� 0.����>
				List<Student> data=new ArrayList<Student>();
				Scanner sc = new Scanner(System.in);
				
				System.out.println("---------------------------------");
				System.out.println("�����������α׷� (ver 1.2.0)");
				System.out.println("---------------------------------");
				String input=null;
				int num=201900;
				while(true){
					System.out.print("1.���� 2.�Է� 3.���� 4.���� 0.����>");
					input=sc.nextLine();
					if(input.equals("0")){break;}
					if(input.equals("1")){
						System.out.println("---------------------------------");
						System.out.println("�й�\t�̸�\t����\t����\t����");
						System.out.println("---------------------------------");
						for(int i=0; i<data.size(); i++){
							Student stu = data.get(i);
							stu.say();
						}
					}else if(input.equals("2")){
						num++;
						Student stu=new Student(num);
						System.out.print("�̸�>");
						stu.name=sc.nextLine();
						System.out.print("����>");
						stu.kor=Integer.parseInt(sc.nextLine());
						System.out.print("����>");
						stu.eng=Integer.parseInt(sc.nextLine());
						System.out.print("����>");
						stu.math=Integer.parseInt(sc.nextLine());
						data.add(stu);
					}else if(input.equals("3")){
						System.out.print("�й�>");
						int target=Integer.parseInt(sc.nextLine());
						int i=0;
						for(i=0; i<data.size(); i++){
							if(target==data.get(i).getNum()){break;}
						}
						if(i==data.size()){continue;}
						Student stu = data.get(i);
						System.out.print("����>");
						stu.kor=Integer.parseInt(sc.nextLine());
						System.out.print("����>");
						stu.eng=Integer.parseInt(sc.nextLine());
						System.out.print("����>");
						stu.math=Integer.parseInt(sc.nextLine());
					}else if(input.equals("4")){
						System.out.print("�й�>");
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
				System.out.println("�̿����ּż� �����մϴ�");

	}

}



















