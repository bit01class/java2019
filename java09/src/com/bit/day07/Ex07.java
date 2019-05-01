/*
총원3명
------------------------------------
학생성적관리프로그램(ver 0.0.2)
------------------------------------
1.입력 2.결과보기 0.종료>1
1번학생 국어>86
1번학생 수학>74
1.입력 2.결과보기 0.종료>1
2번학생 국어>66
2번학생 수학>74
1.입력 2.결과보기 0.종료>1
3번학생 국어>96
3번학생 수학>94
1.입력 2.결과보기 0.종료>1
1.입력 2.결과보기 0.종료>1
1.입력 2.결과보기 0.종료>2
국어 평균: xxx
수학 평균: xxx
1번: B학점, 2번: C학점, 3번: A학점
*/

package com.bit.day07;

public class Ex07{

  public static void main(String[] args){
	int stu1kor=0,stu1math=0;
	int stu2kor=0,stu2math=0;
	int stu3kor=0,stu3math=0;

	System.out.println("------------------------------------"
	+"\n학생성적관리프로그램(ver 0.0.2)\n"
	+"------------------------------------");
	java.util.Scanner sc =new java.util.Scanner(System.in);
	int menu=0;	
	int cnt=0;
	while(true){
	System.out.print("1.입력 2.결과보기 0.종료>");
	menu=sc.nextInt();
	//System.out.println("input:"+menu);
	if(menu==0){break;}
	if(menu==1){
		cnt++;
		if(cnt>3){continue;}
		if(cnt==1){
		  System.out.print(cnt+"번학생 국어>");
		  stu1kor=sc.nextInt();
		  System.out.print(cnt+"번학생 수학>");
		  stu1math=sc.nextInt();
		}else if(cnt==2){
		  System.out.print(cnt+"번학생 국어>");
		  stu2kor=sc.nextInt();
		  System.out.print(cnt+"번학생 수학>");
		  stu2math=sc.nextInt();
		}else if(cnt==3){
		  System.out.print(cnt+"번학생 국어>");
		  stu3kor=sc.nextInt();
		  System.out.print(cnt+"번학생 수학>");
		  stu3math=sc.nextInt();
		}
	}else if(menu==2){
		avg("국어",stu1kor,stu2kor,stu3kor);
		avg("수학",stu1math,stu2math,stu3math);
	}
	}
	
  }

  public static void avg(String msg,int a,int b,int c){
	System.out.print(msg+" 평균: ");
	System.out.println((a+b+c)*100/3/100.0);
  }

}


















