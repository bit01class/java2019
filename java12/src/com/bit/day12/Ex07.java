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
		title += "\n�л������������α׷�(ver 0.1.0)";
		title += "\n---------------------------------------";
		String tableHeader="------------------------------------------";
		tableHeader+="\n�й�|����|����|����|�հ�|���";
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
			System.out.print("1.���� 2.�Է� 0.����>");
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
					System.out.print(cnt+1+"�� ����>");
					student.kor=sc.nextInt();
					System.out.print(cnt+1+"�� ����>");
					student.eng=sc.nextInt();
					System.out.print(cnt+1+"�� ����>");
					student.math=sc.nextInt();
					cnt++;
				}
			}
		}
		
		System.out.println("�̿����ּż� �����մϴ�");
		
	}

}













