package com.bit.day07;
//학생
class Student{
	int num=0;
	int kor=0;
	int eng=0;
	
	public char grade(){
		int su=(kor+eng)/2/10;
		char ch='F';
		switch(su){
			case 10:
			case 9:	ch=(char)(ch-1);// A=F-2-1-1-1
			case 8:	ch=(char)(ch-1);// B=F-2-1-1
			case 7:	ch=(char)(ch-1);// C=F-2-1
			case 6:	ch=(char)(ch-2);// D=F-2
			// F
		}
		return ch;
	}
}


public class Ex08{
  static Student stu1=null;
  static Student stu2=null;
  static Student stu3=null;
  static java.util.Scanner sc = null;

  public static void main(String[] args){
	sc=new java.util.Scanner(System.in);
	String title="------------------------------\n";
	title+="학생성적프로그램(ver 0.0.3)\n";
	title+="------------------------------";
	System.out.println(title);

	int menu=0;	

	stu1=new Student();
	stu1.num=1;
	stu2=new Student();
	stu2.num=2;
	stu3=new Student();
	stu3.num=3;
	
	int cnt=0; //횟수

	while(true){
	 System.out.print("1.입력 2.보기 0.종료>");
	 menu=sc.nextInt();	
	 if(menu==0){break;}
	 
	 switch(menu){
		case 1:	
			cnt++;
			if(cnt==1){
				add(stu1);
			}else if(cnt==2){
				add(stu2);
			}else if(cnt==3){
				add(stu3);
			}			
			break;
		case 2:
			show();
			break;
		default:
			System.out.println("메뉴를 확인하고 다시 입력하세요");
	 }// switch end
	
	}// while end
 
  }// main end

  public static void show(){
	double kor=0.0,eng=0.0;
	kor=(stu1.kor+stu2.kor+stu3.kor)*100/3/100.0;
	eng=(stu1.eng+stu2.eng+stu3.eng)*100/3/100.0;
	System.out.println("국어 평균:"+kor);
	System.out.println("영어 평균:"+eng);
	System.out.println("1번 학점:"+stu1.grade());
	System.out.println("2번 학점:"+stu2.grade());
	System.out.println("3번 학점:"+stu3.grade());
  }

  public static void add(Student stu){
	 
	 System.out.print(stu.num+"번 국어:");
	 stu.kor=sc.nextInt();
	 System.out.print(stu.num+"번 영어:");
	 stu.eng=sc.nextInt();
  }// add end

}// class end


























































