package com.bit.day11;

class Student{
	int num=0;
	static int num2=0;
	int kor=0;
	int eng=0;
	public Student() {
		num2++;
		num=num2;
	}
}

public class Ex12 {

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		Student[] stu=new Student[5];
		stu[0]=new Student();
		stu[1]=new Student();
		stu[2]=new Student();
		stu[3]=new Student();
		stu[4]=new Student();
		stu[0].kor=sc.nextInt();
		stu[0].eng=sc.nextInt();
		stu[1].kor=sc.nextInt();
		stu[1].eng=sc.nextInt();
		for(int i=0; i<stu.length; i++){
		System.out.println(stu[i].num+",kor:"+stu[i].kor);
		}

	}

}








