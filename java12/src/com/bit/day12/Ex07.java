package com.bit.day12;

class Student{
	int num;
	int kor;
	int eng;
	int math;
	
}


public class Ex07 {

	public static void main(String[] args) {
		String title="---------------------------------------";
		title += "\n학생성적관리프로그램(ver 0.1.0)";
		title += "\n---------------------------------------";
		String tableHeader="------------------------------------------";
		tableHeader+="\n학번|국어|영어|수학|합계|평균";
		tableHeader+="\n------------------------------------------";		
		
		Student[] data = new Student[5];
		for(int i=0; i<data.length; i++){
			data[i]=new Student();
			data[i].num=i+1;
		}
		
		System.out.println(title);
		java.util.Scanner sc=new java.util.Scanner(System.in);
		int input=0;
		int cnt=0;
		while(true){
			System.out.print("1.보기 2.입력 0.종료>");
			input=sc.nextInt();
			if(input==0){break;}
			if(input==1){
				System.out.println(tableHeader);
				for(int i=0; i<data.length; i++){
					Student student=data[i];
					System.out.println(student.num+"\t"
					+student.kor+"\t"+student.eng+"\t"+student.math);
				}
			}else if(input==2){
				if(cnt<data.length){
					Student student=data[cnt];
					System.out.print(cnt+1+"번 국어>");
					student.kor=sc.nextInt();
					System.out.print(cnt+1+"번 영어>");
					student.eng=sc.nextInt();
					System.out.print(cnt+1+"번 수학>");
					student.math=sc.nextInt();
					cnt++;
				}
			}
		}
		
		System.out.println("이용해주셔서 감사합니다");
		
	}

}













